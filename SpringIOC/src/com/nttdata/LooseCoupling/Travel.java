package com.nttdata.LooseCoupling;

public class Travel  implements Journey{

	private Vehicle v;
	public void setV(Vehicle v)
	{
		this.v=v;
	}
	
	@Override
	public void startjourney() {
		
		v.move();
	}

}
