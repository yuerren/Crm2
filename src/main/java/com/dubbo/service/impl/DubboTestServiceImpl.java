package com.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.service.DubboTestService;

@Service
public class DubboTestServiceImpl implements DubboTestService {
    @Override
    public String getMessage() {
        return "徐耀祖，真帅！";
    }
}
