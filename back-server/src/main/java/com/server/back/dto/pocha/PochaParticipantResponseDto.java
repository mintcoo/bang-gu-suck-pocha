package com.server.back.dto.pocha;

import com.server.back.domain.pocha.Participant;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@ApiModel(value = "PochaParticipantResponseDto", description = "포차 참가 인원 응답을 위한 데이터 타입")
public class PochaParticipantResponseDto {
    private Long pochaId;
    private Long userId;
    private String nickname;
    private LocalDateTime createAt;
    private LocalDateTime exitAt;
    private Integer isHost;
    private Integer waiting;

    public PochaParticipantResponseDto(Participant e) {
        this.pochaId = e.getPocha().getPochaId();
        this.userId = 700L;
        this.nickname = "닉네임";
        this.createAt = e.getCreateAt();
        this.exitAt = e.getExitAt();
        this.isHost = e.getIsHost();
        this.waiting = e.getWaiting();
    }
}