package com.isSoft.stupidClases;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;

public class Candy {
    private final static Logger log = LoggerFactory.getLogger(Candy.class);
    private final String identificationNumber;
    private final String nameCandy;
    private  double weight;
    private Candy(String identificationNumber, String nameCandy, double weight){
        log.info("Creating candy {}", identificationNumber);
        this.identificationNumber =  identificationNumber;
        this.nameCandy = nameCandy;
        this.weight = weight;
        log.info("Created candy {}", identificationNumber);
    }
    public static Candy createCandy(String nameCandy, double weight){
        return new Candy(UUID.randomUUID().toString(), nameCandy, weight);
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public String getNameCandy() {
        return nameCandy;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) throws IllegalArgumentException{
        if(weight > 0.0)
            this.weight = weight;
        else
            throw  new IllegalArgumentException("The weight must be greater than 0.0");
    }


    @Override
    public String toString() {
        return "Candy{ " +
                "identificationNumber='" + identificationNumber + '\'' +
                ", nameCandy='" + nameCandy + '\'' +
                ", weight=" + weight +
                '}';
    }
}
