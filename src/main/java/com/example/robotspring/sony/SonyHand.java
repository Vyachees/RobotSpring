package com.example.robotspring.sony;


import com.example.robotspring.interfaces.Hand;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SonyHand implements Hand {

    public void catchSomething(){
        log.info("Catched from Sony!!!");
    }

}
