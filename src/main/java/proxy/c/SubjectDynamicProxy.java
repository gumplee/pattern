package proxy.c;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class SubjectDynamicProxy {
	@SuppressWarnings("unchecked")
	public static <T> T newProxyInstace(Subject subject)
	{
		ClassLoader classLoader = subject.getClass().getClassLoader();
		Class<?>[] interfaces = subject.getClass().getInterfaces();
		InvocationHandler h = new MyInvocationHandler(subject);
		new BeforeAdvice().exec();
		return  (T)Proxy.newProxyInstance(classLoader, interfaces, h);
	}
}
