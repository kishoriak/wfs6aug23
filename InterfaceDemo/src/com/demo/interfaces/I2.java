package com.demo.interfaces;

public interface I2 {
   default void m11() {
	   System.out.println("In m11 in I2");
   };
   void m21();
   int m23();
   int i=23;
}
