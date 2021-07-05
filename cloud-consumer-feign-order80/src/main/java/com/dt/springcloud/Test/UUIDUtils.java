package com.dt.springcloud.Test;

import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.IdcardUtil;
import lombok.extern.slf4j.Slf4j;

import java.io.InputStreamReader;
import java.util.UUID;

/**
 * @Auther Du Tao
 * @Date 2021-07-02 9:56
 */
@Slf4j
public class UUIDUtils {
    public static void main(String[] args) {
        String s = UUIDUtils.genUUID();
        log.info(s);
        log.info(s.replaceAll("-", ""));
        String s1 = IdUtil.simpleUUID();
        log.info(s1);
        log.info(Md5Utils.md5hash("dt268956909"));
        log.info(CryptoUtil.encry("dt268956909", "123"));
        log.info(CryptoUtil.decry("FD4A336091A8F6295C324E378EFAA4EA", "123"));
        boolean validCard = IdcardUtil.isValidCard("140225199503285119");
        log.info("Province :" + IdcardUtil.getProvinceByIdCard("14022519950328511X"));

    }

    /**
     * @return UUID
     */
    public static String genUUID() {
        return UUID.randomUUID().toString();
    }

    /**
     * @return 不带中横线的UUID
     */
    public static String genUUID32() {
        return genUUID().replaceAll("\\-", "");
    }
}