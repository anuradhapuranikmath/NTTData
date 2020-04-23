package com.nttdata.StructuralDesignPatter.BridgePattern;

public class QuestionFormat  extends QuestionManager{

	public QuestionFormat(String catalog) {
		super(catalog);
		
	}
public void  displayAll()
{
	System.out.println("\n _____________________________________________");
	super.displayAll();
	System.out.println("_________________________________________________");
}
}
