package singleton;

/*
 * 饿汉模式 类加载机制保证多线程安全
 */
public class SingletonB {
	private static SingletonB instance = new SingletonB();
	private SingletonB(){};
	public static SingletonB getInstance()
	{
		return instance;
	}
}
