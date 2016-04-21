package singleton;

/*
 * ˫��У�������� 
 * ˫�ؼ��������Ƶ�ʵ�ֻ�ʹ��һ���ؼ���volatile��������˼�ǣ���volatile
 * ���εı�����ֵ�������ᱻ�����̻߳��棬���жԸñ����Ķ�д����ֱ�Ӳ��������ڴ棬�Ӷ�
 * ȷ������߳�����ȷ�Ĵ���ñ�����
 *
 * ˵��������volatile�ؼ��ֿ��ܻ����ε�������е�һЩ��Ҫ�Ĵ����Ż�����������Ч�ʲ�����
 * �ܸߡ����һ�㽨�飬û���ر����Ҫ����Ҫʹ�á�Ҳ����˵����Ȼ����ʹ�� ˫�ؼ�����
 * ������ʵ���̰߳�ȫ�ĵ���������������������ã����Ը��������ѡ�á�
 */
public class SingletonE {
	private static volatile SingletonE instance;
	private SingletonE(){};
	public static SingletonE getInstance()
	{
		if (instance == null) {
			synchronized (SingletonE.class) {
				if (instance == null) {
					instance = new SingletonE();
				}
			}
		}
		return instance;
	}
}
