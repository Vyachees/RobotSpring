package com.example.robotspring.toshiba;


import com.example.robotspring.interfaces.Hand;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ToshibaHand implements Hand {

    public void catchSomething(){
        log.info("Catched from Toshiba!!!");
    }

}
