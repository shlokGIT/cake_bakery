package com.bakery.bakery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class cakeBaker {
    @Autowired
   private final ChoclateFrosting choclateFrosting;
    @Autowired
   private final  ChoclateSyrup choclateSyrup;

    public cakeBaker(ChoclateFrosting choclateFrosting, ChoclateSyrup choclateSyrup) {
        this.choclateFrosting = choclateFrosting;
        this.choclateSyrup = choclateSyrup;
    }


    public void bakeCake() {
        System.out.println("cake is baking");
        choclateFrosting.getFrostingType();
        choclateSyrup.getSyrupType();
        System.out.println("cake is ready");

    }
}

