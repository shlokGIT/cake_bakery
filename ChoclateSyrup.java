package com.bakery.bakery;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class ChoclateSyrup implements InterfaceSyrup {
    @Override
    public void getSyrupType() {
        System.out.println(" choclate syrup");
    }

}
