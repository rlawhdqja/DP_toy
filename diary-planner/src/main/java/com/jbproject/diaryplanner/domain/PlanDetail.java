package com.jbproject.diaryplanner.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class PlanDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    @Column(name = "planDetailId")
    private long planDetailId;

    @Column(name = "planDetailContext")
    private String planDetailContext;

    @Column(name = "planDetailStartTime")
    private LocalDateTime planDetailStartTime;

    @Column(name = "planDetailEndTime")
    private LocalDateTime planDetailEndTime;

    @Column(name = "planDetailCategory")
    private String planDetailCategory;

    // 계획 수정
    public void  planUpdate(String planDetailContext, LocalDateTime planDetailStartTime, LocalDateTime planDetailEndTime, String planDetailCategory){
        this.planDetailContext = planDetailContext;
        this.planDetailStartTime = planDetailStartTime;
        this.planDetailEndTime = planDetailEndTime;
        this.planDetailCategory = planDetailCategory;
    }
}
