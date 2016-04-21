package singleton;

/*
 *  类加载机制保证的多线程安全 静态内部类初始化时机保证饿汉模式
 */
public class SingletonC {
	private static final class SingletonCHolder{
		private static SingletonC instance = new SingletonC();
	}
	private SingletonC(){}
	public static SingletonC getInstance(){
		return SingletonCHolder.instance;
	}
}
