package com.ai.runner.center.pay.constants;

/**
 * 支付中心异常编码定义
 * Date: 2015年7月22日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * 
 * @author lilg
 */
public final class ExceptCodeConstants {
    
    private ExceptCodeConstants() {
        
    }
    
    // 系统级异常[其它系统级异常，未知异常]
    public static final String SYSTEM_ERROR = "999999";

    // 请求参数为空
    public static final String PARAM_IS_NULL = "888888";
        
    /**
     * 参数有误
     */
    public static final String PARAM_IS_WRONG = "000002";
    //结果数量错误
    public static final String RESULT_COUNT_WRONG = "000003";

}
