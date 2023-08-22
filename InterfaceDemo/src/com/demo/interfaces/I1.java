package com.demo.interfaces;

public interface I1 {
  default void m11() {
	  System.out.println("in m11 in I1");
  };
  void m12();
  
  //static functions are allowed
  public static int m13(int c) {
	  int x=23+c;
	  return x;
  }
  
  default void m14() {
	  System.out.println("in m14 method");
  }
}
