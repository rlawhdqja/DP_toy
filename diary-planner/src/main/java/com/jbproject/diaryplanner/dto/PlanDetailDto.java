package com.jbproject.diaryplanner.dto;

import com.jbproject.diaryplanner.domain.PlanDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ApiModel(value = "PlanDto : 계획 상세 정보 정보", description = "계획 상세 정보를 나타낸다.")
public class PlanDetailDto {

    public PlanDetailDto (PlanDetail planDetail) {
        this.planDetailId = planDetail.getPlanDetailId();
        this.planDetailContext = planDetail.getPlanDetailContext();
        this.planDetailStartTime = planDetail.getPlanDetailStartTime();
        this.planDetailEndTime = planDetail.getPlanDetailEndTime();
        this.planDetailCategory = planDetail.getPlanDetailCategory();
    }



    @ApiModelProperty(position = 1, value = "계획 상세 정보 아이디", notes = "자동으로 생성되므로 작성 보내지 않는다.")
    private long planDetailId;

    @ApiModelProperty(position = 2, value = "계획 상세 내용")
    private String planDetailContext;

    @ApiModelProperty(position = 3, value = "계획 상세 시작 시간")
    private LocalDateTime planDetailStartTime;

    @ApiModelProperty(position = 4, value = "계획 상세 종료 시간")
    private LocalDateTime planDetailEndTime;

    @ApiModelProperty(position = 5, value = "계획 상세 카테고리")
    private String planDetailCategory;
}
