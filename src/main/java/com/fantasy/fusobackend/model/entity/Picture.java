package com.fantasy.fusobackend.model.entity;

import lombok.Data;

/**
 * 图片
 */
@Data
public class Picture {

    /**
     * 标题
     */
    private String title;

    /**
     * 图片地址
     */
    private String url;
}
