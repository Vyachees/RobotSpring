package com.example.robotspring.toshiba;


import com.example.robotspring.interfaces.Leg;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ToshibaLeg implements Leg {

    public void go(){
        log.info("Go from Toshiba!!!");
    }

}
