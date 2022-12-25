package com.example.robotspring.toshiba;


import com.example.robotspring.interfaces.Head;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ToshibaHead implements Head {

    public void calc(){
        log.info("Thinking from Toshiba!!!");
    }

}
