package com.vrsa9208.designPatterns.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SecurityProxy implements InvocationHandler {
	
	private Object obj;
	
	private SecurityProxy(Object obj) {
		this.obj = obj;
	}
	
	public static Object newInstance(Object obj) {
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new SecurityProxy(obj));
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result;
		try {
			System.out.println("Method called: " + method.getName());
			
			if(method.getName().contains("post")) {
				throw new RuntimeException("No POST allowed");
			}
			result = method.invoke(obj, args);
		} catch(InvocationTargetException ex) {
			throw ex.getTargetException();
		} catch(Exception ex) {
			throw new RuntimeException("unexpected invocation exception: " + ex.getMessage());
		}
		
		return result;
	}

}
