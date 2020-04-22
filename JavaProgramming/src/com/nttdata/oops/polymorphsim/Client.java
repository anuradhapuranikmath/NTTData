package com.nttdata.oops.polymorphsim;

public class Client {

	public static void main(String[] args) {
		
		/*Area area=new Area();
		area.area(10);
		area.area(10, 20);
		double d=area.area(10, 20, 30);
				System.out.println(" Area of Cuboid is "+d);*/

		Person person=new Student();
		person.greetPerson();
	}

}
