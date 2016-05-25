package com.ai.runner.center.pay.util;

import com.ai.runner.sdk.cache.client.ICacheClient;
import com.ai.runner.sdk.cache.factory.CacheClientBuilderFactory;

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
        return CacheClientBuilderFactory.getCacheClientBuilder().getCacheClient(namespace);
    }

}
