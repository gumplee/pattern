package singleton;

/*
 * ����ģʽ ����ػ��Ʊ�֤���̰߳�ȫ
 */
public class SingletonB {
	private static SingletonB instance = new SingletonB();
	private SingletonB(){};
	public static SingletonB getInstance()
	{
		return instance;
	}
}
