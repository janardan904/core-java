package com.nt.code;


class Case1{
	public void m1(String s) {
		System.out.println("String version");
	}
	public void m1(Object o) {
		System.out.println("Object version");
	}
}

public class overloadingCase1 {
	public static void main(String[] args) {
		Case1 case1=new Case1();
		case1.m1("durga");
		case1.m1("janardan");

	}

}
