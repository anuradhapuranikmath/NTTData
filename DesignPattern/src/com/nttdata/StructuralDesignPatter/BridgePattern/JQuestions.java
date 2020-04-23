package com.nttdata.StructuralDesignPatter.BridgePattern;

import java.util.ArrayList;
import java.util.List;

public class JQuestions  implements Questions{
private List<String>questions =new ArrayList<String>();
private int current =0;

 public JQuestions() {
	questions.add("what is java");
	questions.add("what is inheritance ");
	questions.add("what is absraction");
	questions.add("What is abstraction? ");  
    questions.add("How multiple polymorphism is achieved in java? ");  
    questions.add("How many types of exception  handling are there in java? ");  
    questions.add("Define the keyword final for  variable, method, and class in java? ");  
    questions.add("What is abstract class? ");  
    questions.add("What is multi-threading? "); 
}
	@Override
	public void nextQuestion() {
		if(current<=questions.size()-1)
			current++;
     		System.out.println(current);
		
	}

	public void previousQuestion() {  
	    if( current > 0 )  
	    current--;  
	 }  
	  
	 public void newQuestion(String quest) {  
	    questions.add(quest);  
	 }  
	  
	 public void deleteQuestion(String quest) {  
	    questions.remove(quest);  
	 }  
	  
	 public void displayQuestion() {  
	    System.out.println( questions.get(current) );  
	 }  
	 public void displayAllQuestions() {  
	    for (String quest : questions) {  
	    System.out.println(quest);  
	 }
	}  
}
