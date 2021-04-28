package org.edu;
public class Arts extends Education {
	public void bSc() {
	System.out.println("50%");
}
	public void bEd() {
		System.out.println("60%");
	}
	public void bA() {
		System.out.println("65%");
	}
	public void bBA() {
		System.out.println("70%");
	}
	public void ug() {
		System.out.println("45%");
	}
	public void pg() {
		System.out.println("55%");
	}
	public void Mbbs() {
		System.out.println("95%");
	}
	public void Bds() {
		System.out.println("100%");

	}
	public static void main(String[] args) {
		Arts a = new Arts();
		a.bA();
		a.bBA();
		a.bEd();
		a.bSc();
		a.ug();
		a.pg();
	}
}
