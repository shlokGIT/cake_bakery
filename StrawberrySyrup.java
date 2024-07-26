package com.bakery.bakery;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "cake.syrup",havingValue = "strawberry")
public class StrawberrySyrup implements InterfaceSyrup{
    @Override
   public void getSyrupType(){
        System.out.println(" strawberry syrup");
    }

}
