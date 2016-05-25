package com.ai.runner.center.pay.util;

import com.ai.opt.sdk.components.mcs.MCSClientFactory;
import com.ai.paas.ipaas.mcs.interfaces.ICacheClient;

/**
 * 从工厂中获取缓存客户端
 *
 * Date: 2015年11月5日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * @author fanpw
 */
public final class CacheFactoryUtil {

    private CacheFactoryUtil() {
    }

    public static ICacheClient getCacheClient(String namespace) {
        return MCSClientFactory.getCacheClient(
                namespace);
    }

}
