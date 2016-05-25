package com.ai.runner.center.pay.constants;

/**
 * 支付中心常量定义类
 *
 * Date: 2015年10月29日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * @author fanpw
 */
public final class PayConstants {

    private PayConstants() {
        
    }
    
    /**
     * 支付中心流水表常量定义
     *
     * Date: 2015年10月29日 <br>
     * Copyright (c) 2015 asiainfo.com <br>
     * @author fanpw
     */
    public final class PayCenterLog {
        
        private PayCenterLog() {
            
        }
        
        /**
         * 支付状态
         *
         * Date: 2015年10月29日 <br>
         * Copyright (c) 2015 asiainfo.com <br>
         * @author fanpw
         */
        public final class Status {
            
            private Status() {
                
            }
            
            /**
             * 申请支付
             */
            public static final int CREATE = -1;
            
            /**
             * 待支付（向第三方支付发起支付）
             */
            public static final int APPLY = 1;

            /**
             * 支付交易成功 
             */
            public static final int PAYED_SUCCESS = 2;

            /**
             * 支付失败
             */
            public static final int PAYED_FAILED = 3;
            
            /**
             * 申请退款
             */
            public static final int REFUND_APPLY = 5;
            
            /**
             * 接受退款申请
             */
            public static final int REFUND_ACCEPT = 6;
            
            /**
             * 退款申请失败
             */
            public static final int REFUND_REFUSE = 7;
            
            /**
             * 退款成功
             */
            public static final int REFUND_SUCCESS = 8;

            /**
             * 退款失败
             */
            public static final int REFUND_FAIL = 9;

            /**
             * 退款到账
             */
            public static final int REFUND_FINISH = 10;

            /**
             * 提现成功
             */
            public static final int TAKE_SUCCESS = 11;

            /**
             * 提现失败
             */
            public static final int TAKE_FAIL = 12;
            
        }
        
        /**
         * 支付请求类型
         * 
         * Date: 2015年11月2日 <br>
         * Copyright (c) 2015 asiainfo.com <br>
         * 
         * @author fanpw
         */
        public final class PayRequestType {

            private PayRequestType() {

            }

            /**
             * 支付
             */
            public static final int PAY = 1;

            /**
             * 退款
             */
            public static final int REFUND = 2;

            /**
             * 提现
             */
            public static final int TAKE = 3;
        }
        
        /**
         * 对帐/轧帐状态
         *
         * Date: 2015年10月29日 <br>
         * Copyright (c) 2015 asiainfo.com <br>
         * @author fanpw
         */
        public final class CheckStatus {
            
            /**
             * 未对账
             */
            public static final int YET_CHECK = 0; 
            
        }
        
    }
    
}
