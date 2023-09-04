package com.jbproject.diaryplanner.dto;

import com.jbproject.diaryplanner.domain.User;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private Long uid;
    private String email;
    private String password;
    private String nickname;
    private boolean email_check;

    @ApiModelProperty(value = "유저가 생성한 Diary id목록", notes="id를 이용해서 Diary 테이블에서 검색")
    private List<Long> diarys;
    @ApiModelProperty(value = "유저가 작성한 Plan id목록", notes="id를 이용해서 Plan 테이블에서 검색")
    private List<Long> plans;

    public UserDto(User user) {
        this.nickname = user.getNickname();
        this.email = user.getEmail();
    }
}
