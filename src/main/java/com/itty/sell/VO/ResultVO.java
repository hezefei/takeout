package com.itty.sell.VO;

import lombok.Data;

/**
 * @Auther: hezefei
 * @Date: 2018/10/27 00:55
 * @Description:
 */
@Data
public class ResultVO<T> {

    /** 错误码. */
    private Integer code;

    /** 提示信息. */
    private String msg;

    /** 具体内容. */
    private T data;
}
