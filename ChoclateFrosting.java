package com.bakery.bakery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Configuration

public class ChoclateFrosting implements InterfaceFrosting {

    @Override

    public void getFrostingType(){
        System.out.println(" choclate frosting");
    }



}
