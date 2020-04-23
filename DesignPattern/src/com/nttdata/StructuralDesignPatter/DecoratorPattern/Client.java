package com.nttdata.StructuralDesignPatter.DecoratorPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
		private static int  choice;  
	    public static void main(String args[]) throws NumberFormatException, IOException    {  
	       do{        
	        System.out.print("========= Food Menu ============ \n");  
	        System.out.print("            1. Vegetarian Food.   \n");  
	        System.out.print("            2. Non-Vegetarian Food.\n");  
	        System.out.print("            3. Exit                        \n");  
	        System.out.print("Enter your choice: ");  
	        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));   
	        choice=Integer.parseInt(br.readLine());  
	        switch (choice) {  
	        case 1:{   
	                 VegFood vf=new VegFood();  
	              System.out.println(vf.prepareFood());  
	              System.out.println( vf.foodprice());  
	            }  
	            break;  
	              
	                case 2:{  
	                Food f1=new NonVegFood((Food)new VegFood());
	                    System.out.println(f1.prepareFood());  
	                System.out.println( f1.foodprice());  
	        }  
	            break;    
	              
	         default:{    
	            System.out.println("Other than these no food available");  
	        }         
	    return;  
	     }//end of switch  

}while(choice!=3);  
}  
}  
