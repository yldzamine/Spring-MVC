package com.amine.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MetotOncesi  implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		if(method.getName().equals("Personelbilgiver")) {
		System.out.println("*******ÖNCE********BİLGİ");
			}
		
	if(method.getName().equals("selamlama")) {
	System.out.println("*******ÖNCE********SELAMLAMA");
		}
}
}
