package com.jpk.flying;

public class NotFlying implements FlyingBehavior
{

    @Override
    public void fly()
    {
        System.out.print( "Actually I'm not flying" );
        
    }

 

    
    
}
