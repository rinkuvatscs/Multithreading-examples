package com.multithreading.using.thread.cls.example;

public class GenericExample {

	public <E> void display(E element) {
		System.out.println(element);
		if(element instanceof Rinku) {
			((Rinku)element).disDemo();
		}
	}
	
	 public static void main( String args[] )
	    {
		 Integer inte =  1 ;
	        Double doubles =  1.1;
	        Character charex = 'H' ;
	        
	        GenericExample genericExample = new GenericExample();
	        genericExample.display(inte);
	        genericExample.display(doubles);
	        genericExample.display(charex);
	        Rinku rinku = new Rinku();
	        genericExample.display(rinku);
	    }
	      
	
}

class Rinku {
	public void disDemo() {
	System.out.println("disDemo Here ");	}
}