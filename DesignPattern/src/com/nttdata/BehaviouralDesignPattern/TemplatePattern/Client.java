package com.nttdata.BehaviouralDesignPattern.TemplatePattern;

public class Client {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {  
        
        Class c=Class.forName("com.nttdata.BehaviouralDesignPattern.TemplatePattern.Chess"); 
        Game game=(Game)c.newInstance();  
        game.play();     
      }  
}// End of the Soccer class.  
	
	

