package com.nttdata.CreationalDesginPattern.SingletonPattern;

public class Client {
public static void main(String[] args) {
	Singleton s=Singleton.getInstance();
	s.foo();
}
}
