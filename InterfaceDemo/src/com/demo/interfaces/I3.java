package com.demo.interfaces;

public interface I3 extends I1,I2{
   void m31();
   void m32();
@Override
default void m11() {
	// TODO Auto-generated method stub
	I1.super.m11();
}
}
