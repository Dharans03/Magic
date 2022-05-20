package org.emp;

public class Anu implements Client{
	
	@Override
	public void cilId() {
		System.out.println("ABC");
			}
	@Override
	public void cilName() {
		System.out.println("BBB");
		}
@Override
public void cilDetails() {
	System.out.println("CCC");
	
}
	public static void main(String[] args) {
		Anu a = new Anu();
		a.cilId();
		a.cilName();
		a.cilDetails();
	}
}
