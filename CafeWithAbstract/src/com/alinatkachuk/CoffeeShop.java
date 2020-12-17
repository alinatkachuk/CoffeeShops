package com.alinatkachuk;

public abstract class CoffeeShop {

	public void Wait() {
		System.out.println ("Please, wait a minute!");
	}
	
	public abstract void MakeLatte();
	
	public abstract void MakeCappuccino();
	
	public abstract void MakeAmericano();
	
	public abstract void MakeRaf();

}
