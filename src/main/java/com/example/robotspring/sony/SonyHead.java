package com.example.robotspring.sony;


import com.example.robotspring.interfaces.Head;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SonyHead implements Head {

    public void calc(){
        log.info("Thinking from Sony!!!");
    }

}
