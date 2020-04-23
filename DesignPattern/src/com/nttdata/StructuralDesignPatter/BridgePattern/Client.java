package com.nttdata.StructuralDesignPatter.BridgePattern;

public class Client {
public static void main(String[] args) {
	QuestionFormat q=new QuestionFormat("java questions");
	q.q=new JQuestions();
	q.delete("what is java");
	q.display();
	
	q.newOne("what is OOP");
	q.displayAll();
}
}
