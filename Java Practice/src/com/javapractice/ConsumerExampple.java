package com.javapractice;

import java.util.function.Consumer;

public class ConsumerExampple {
	
	public static void main(String[] args) {
		
		Consumer<String> c=s->System.out.println(s);
		c.accept("amos");
		c.accept("soft");
	}
}
