package com.tuling.testbeanfacotoryPostProcessor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by smlz on 2019/5/26.
 */

@Component
public class TulingLog {

    @Value("1")
    private int flag;

    @Override
    public String toString() {
        return "TulingLog{" +
                "flag=" + flag +
                '}';
    }

    public TulingLog() {

        System.out.println("我是TulingLog的构造方法");
    }



    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }
}
