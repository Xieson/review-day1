package com.clp.temo;
/*
 * 知识点:final修饰符
 * */
public  class Extendsdome {
	final static int i=1;//用final修饰的字段不能在进行第二次赋值
	final static void aa(){
		System.out.println("我是Extendadome的aa()方法");
	}
	public static void main(String[] args){
		System.out.println(Extendsdome.i);
		Extendsdome.aa();
		
	}
}
