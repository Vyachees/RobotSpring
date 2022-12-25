package com.example.robotspring.interfaces;

public
interface Hand {
    default void catchSomething() {
        System.out.println("HANDinterface");
       /// log.info("HANDinterface");

    }


}
