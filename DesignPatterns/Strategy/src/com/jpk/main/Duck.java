package com.jpk.main;


import com.jpk.flying.FlyingBehavior;

public class Duck
{

    
    
    private FlyingBehavior flyingBehavior;
    
    public Duck(){}
    
    
    public Duck( FlyingBehavior flyingBehavior)
    {
        this.flyingBehavior = flyingBehavior;

    }

    public void doFlying()
    {
       
       this.flyingBehavior.fly();
        
    }






  
    
   
    
    
       

    
    

}
