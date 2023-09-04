package com.jbproject.diaryplanner.dto;

import com.jbproject.diaryplanner.domain.Plan;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ApiModel(value = "PlanDto : 계획표 정보", description = "계획표 정보를 나타낸다.")
public class PlanDto {

    public PlanDto(Plan plan){
        this.planId = plan.getPlanId();
        this.planCreateTime = plan.getDiaryCreateTime();
    }

    public PlanDto(long planId) {
        this.planId = planId;
    }

    @ApiModelProperty(position = 1, value = "계획표 아이디", notes = "자동으로 생성되므로 작성 보내지 않는다.")
    private long planId;

    @ApiModelProperty(position = 2, value = "계획표 생성 시간")
    private LocalDateTime planCreateTime;
}
