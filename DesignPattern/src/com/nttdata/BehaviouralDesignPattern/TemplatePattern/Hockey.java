package com.nttdata.BehaviouralDesignPattern.TemplatePattern;

public class Hockey extends Game{
	@Override  
    void initialize() {  
       System.out.println("Hockey Game Initialized! Start playing.");  
    }  

 @Override  
    void start() {  
       System.out.println("Game Started. Welcome to in the Hockey game!");  
    }  
      
 @Override  
    void end() {  
       System.out.println("Game Finished!");  
    }  
}
