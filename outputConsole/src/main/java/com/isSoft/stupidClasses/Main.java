package com.isSoft.stupidClasses;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        log.debug("Start of the program");
        Candy candy1 = Candy.createCandy("Барбариска", 0.12);
        Candy candy2 = Candy.createCandy("Ирис", 0.13);
        try {
            candy1.setWeight(0);
        }
        catch (IllegalArgumentException e){
            log.error("Incorrect weight! ", e);
        }
        log.debug("The end of the program");

    }
}
