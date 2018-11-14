package io.randomcoding.model;

public class Hello{
    
    private String greeting;
    
    public Hello(String name){
        this.greeting="Hi "+name;        
    }
    
    public String getGreeting(){
        return this.greeting;
    }
    
    public void setGreeting(String name){
        this.greeting = name;
    }
    
}