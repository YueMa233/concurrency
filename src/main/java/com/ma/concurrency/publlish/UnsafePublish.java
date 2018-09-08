package com.ma.concurrency.publlish;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class UnsafePublish {
    private String[] states = {"a","b","c"};
    public String[] getStates(){
        return states;
    }

    public static void main(String[] args) {
        UnsafePublish unsafePublish = new UnsafePublish();
        log.info("{}",Arrays.toString(unsafePublish.getStates()));

    }
}
