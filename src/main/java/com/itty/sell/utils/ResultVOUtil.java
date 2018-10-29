package com.itty.sell.utils;

import com.itty.sell.VO.ResultVO;

/**
 * @Auther: hezefei
 * @Date: 2018/10/27 01:05
 * @Description:
 */
public class ResultVOUtil {
    public static ResultVO success(Object object) {
        ResultVO resultVo = new ResultVO();
        resultVo.setCode(0);
        resultVo.setMsg("成功");
        resultVo.setData(object);
        return resultVo;
    }
    public static ResultVO success() {
        return success(null);
    }
    public static ResultVO error(Integer code,String msg) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }
}
