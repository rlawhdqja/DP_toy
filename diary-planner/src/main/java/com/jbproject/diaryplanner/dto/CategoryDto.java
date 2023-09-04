package com.jbproject.diaryplanner.dto;

import com.jbproject.diaryplanner.domain.Category;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;

public class CategoryDto {

    public CategoryDto(Category category) {
        this.categoryId = category.getCategoryId();
        this.categoryName = category.getCategoryName();
    }

    @ApiModelProperty(position = 1, value = "카테고리 아이디", notes = "자동으로 생성되므로 작성 보내지 않는다.")
    private Long categoryId;

    @ApiModelProperty(position = 2, value = "카테고리명")
    private String categoryName;
}
