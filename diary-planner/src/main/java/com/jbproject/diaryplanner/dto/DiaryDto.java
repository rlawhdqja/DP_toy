package com.jbproject.diaryplanner.dto;


import com.jbproject.diaryplanner.domain.Diary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ApiModel(value = "DiaryDto : 일기 정보", description = "일기의 상세 정보를 나타낸다.")
public class DiaryDto {
    public DiaryDto(Diary diary){
        this.diaryId = diary.getDiaryId();
        this.diaryTitle = diary.getDiaryTitle();
        this.diaryContext = diary.getDiaryContext();
        this.diaryCreateTime = diary.getDiaryCreateTime();
    }

    public DiaryDto(long diaryId, String diaryTitle, String diaryContext) {
        this.diaryId = diaryId;
        this.diaryTitle = diaryTitle;
        this.diaryContext = diaryContext;
    }

    @ApiModelProperty(position = 1, value = "일기 아이디", notes = "자동으로 생성되므로 작성 보내지 않는다.")
    private long diaryId;

    @ApiModelProperty(position = 2, value = "일기 제목")
    private String diaryTitle;

    @ApiModelProperty(position = 3, value = "일기 내용")
    private String diaryContext;

    @ApiModelProperty(position = 4, value = "일기 생성 시간")
    private LocalDateTime diaryCreateTime;
}

