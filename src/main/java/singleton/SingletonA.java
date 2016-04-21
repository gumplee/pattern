package singleton;
/*
 * 非线程安全懒汉模式
 */
public class SingletonA {
	private static SingletonA instance;
	private SingletonA(){};
	public static SingletonA getInstance()
	{
		if (instance == null) {
			instance = new SingletonA();
		}
		return instance;
	}
}
