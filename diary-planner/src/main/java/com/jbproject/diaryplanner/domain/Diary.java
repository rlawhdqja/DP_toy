package com.jbproject.diaryplanner.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Diary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    @Column(name = "diaryId")
    private long diaryId;

    @Column(name = "diaryTitle")
    private String diaryTitle;

    @Column(name = "diaryContext")
    private String diaryContext;

    @CreationTimestamp  // 현재시간 입력
    private LocalDateTime diaryCreateTime;

    // 일기 수정
    public void  boardUpdate(String diaryTitle, String diaryContext){
        this.diaryTitle = diaryTitle;
        this.diaryContext = diaryContext;
    }

}
