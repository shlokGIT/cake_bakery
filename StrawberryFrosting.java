package com.bakery.bakery;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "cake.frosting",havingValue = "strawberry")
public class StrawberryFrosting implements  InterfaceFrosting{
    @Override
    public void getFrostingType() {
        System.out.println(" Strawberry frosting");
    }

}
