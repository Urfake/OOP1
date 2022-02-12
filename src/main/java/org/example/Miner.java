package org.example;

import org.springframework.beans.factory.annotation.Autowired;

public class Miner{
    private Algorithm algorithm;

    @Autowired
    Miner(Algorithm algorithm){
        this.algorithm = algorithm;
    }

    void run(){
        System.out.println("Miner runned...");
        algorithm.run();
    }

}
