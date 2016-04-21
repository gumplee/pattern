package singleton;
/*
 * �̰߳�ȫ����ģʽ Ч�ʵ�
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
