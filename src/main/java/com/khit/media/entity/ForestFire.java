package com.khit.media.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ForestFire {
    @JsonProperty("FRFR_INFO_ID")
    private String id;
    
    @JsonProperty("FRFR_OCCRR_ADDR")
    private String occurrenceAddress;
    
    // 다른 필드들에 대해서도 동일하게 작성
    // Getter 및 Setter도 필요할 수 있음
}