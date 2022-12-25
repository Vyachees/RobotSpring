package com.example.robotspring.sony;


import com.example.robotspring.interfaces.Leg;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SonyLeg implements Leg {

    public void go(){
        log.info("Go from Sony!!!");
    }

}
