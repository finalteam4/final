package com.khit.media.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.khit.media.entity.Board;

public interface BoardRepository extends JpaRepository<Board, Long>{

    Page<Board> findByBoardTitleContaining(String kw, Pageable pageable);
    
    Page<Board> findByBoardContentContaining(String kw, Pageable pageable);

    Page<Board> findByBoardWriterContaining(String kw, Pageable pageable);

    @Modifying
    @Query(value="update Board b set b.boardHits=b.boardHits+1 where b.id=:id")
	public void updateHits(Long id);
    
    @Modifying
    @Query(value="update Board b set b.boardHits=b.boardHits-1 where b.id=:id")
	public void updateHits2(Long id);

	Page<Board> findByBoardCategoryContainingAndBoardTitleContaining(String cate, String kw, Pageable pageable);
	
	Page<Board> findByBoardCategoryContainingAndBoardWriterContaining(String cate, String kw, Pageable pageable);

	Page<Board> findByBoardCategoryContainingAndBoardContentContaining(String cate, String kw, Pageable pageable);

	Page<Board> findByBoardCategoryContaining(String cate, Pageable pageable);
	
	@Modifying
    @Query(value="UPDATE Board b SET b.replyCount = (SELECT count(r.id) FROM Reply r WHERE r.boardId = :id) WHERE b.id = :id")
	public void updateReplyCount(Long id);
	
	@Modifying
    @Query(value="UPDATE Board b SET b.likeCount = (SELECT count(v.id) FROM Vote v WHERE v.boardId = :id) WHERE b.id = :id")
	public void updateLikeCount(Long id);

	List<Board> findByBoardCategoryContaining(String cate);
	
	@Modifying
    @Query(value="UPDATE Board b SET b.reportCount = (SELECT count(t.id) FROM Report t WHERE t.boardId = :id) WHERE b.id = :id")
	public void updateReportCount(Long id);
	
	@Query(value = "SELECT b FROM Board b JOIN Vote v ON b.id = v.boardId WHERE v.voter = :voter")
	Page<Board> findVoteListAll(String voter, Pageable pageable);

	Page<Board> findByBoardWriter(String name, Pageable pageable);
	
	@Modifying
	void deleteByBid(Integer bid);

	Page<Board> findByBid(String kw, Pageable pageable);

}
