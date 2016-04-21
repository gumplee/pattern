package singleton;
/*
 * 线程安全懒汉模式 效率低
 */
public class SingletonD {
	private static SingletonD instance;
	private SingletonD(){};
	public static synchronized SingletonD getInstance()
	{
		if (instance == null) {
			instance = new SingletonD();
		}
		return instance;
	}
}
