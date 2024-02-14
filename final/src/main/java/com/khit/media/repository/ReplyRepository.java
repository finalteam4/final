package com.khit.media.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import com.khit.media.entity.Reply;

public interface ReplyRepository extends JpaRepository<Reply, Long>{

	List<Reply> findByBoardId(Long boardId);
	
	@Modifying
	void deleteByBoardId(Long id);
	
	@Modifying
	void deleteByReplyer(String name);

	Page<Reply> findByReplyer(String name, Pageable pageable);


}