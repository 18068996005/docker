package com.deppon.zc.service.impl;

import com.deppon.zc.service.TestHello;
import org.springframework.stereotype.Service;

/**
 * Created by 337453 on 2017-05-13.
 */
@Service
public class TestHelloImpl implements TestHello {

    @Override
    public String getStr() {
        return "hello my docker";
    }
}
