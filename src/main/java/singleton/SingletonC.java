package singleton;

/*
 *  ����ػ��Ʊ�֤�Ķ��̰߳�ȫ ��̬�ڲ����ʼ��ʱ����֤����ģʽ
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
