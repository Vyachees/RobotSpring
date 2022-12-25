package com.example.robotspring.robot;

import com.example.robotspring.interfaces.Hand;
import com.example.robotspring.interfaces.Head;
import com.example.robotspring.interfaces.Leg;
import com.example.robotspring.interfaces.Robot;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


@Slf4j
@Getter
@Setter
public class ModelT1000 implements
        Robot, InitializingBean, DisposableBean {

    private Hand hand;
    private Leg leg;
    private Head head;

    private String color;
    private  int year;
    private boolean soundEnabled;

    public  ModelT1000() {
    }

    public  ModelT1000(Hand hand, Leg leg, Head head){
        super();
        this.hand= hand;
        this.leg=leg;
        this.head = head;

    }

    public  ModelT1000(Hand hand, Leg leg, Head head, String color,int year,boolean soundEnabled){
        super();
        this.hand= hand;
        this.leg=leg;
        this.head = head;
        this.color=color;
        this.year=year;
        this.soundEnabled=soundEnabled;

    }

    public  ModelT1000(String color,int year,boolean soundEnabled){
        super();
        this.color=color;
        this.year=year;
        this.soundEnabled=soundEnabled;

    }


    @Override
    public void action() {
        head.calc();
        hand.catchSomething();
        leg.go();

        log.info("color "+color);
        log.info("year "+year);
        log.info("can play sound: "+soundEnabled );
    }

    @Override
    public void dance() {
        log.info("T1000 is dancing!!!");
    }

    public void initObject() {
     log.info("init");
    }

    public void destroyObject() {
        log.info("destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("Init from interface");
    }

    @Override
    public void destroy() throws Exception {
        log.info("Destroy from interface");
    }
}
