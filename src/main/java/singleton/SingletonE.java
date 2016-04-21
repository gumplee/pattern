package singleton;

/*
 * 双重校验锁机制 
 * 双重检查加锁机制的实现会使用一个关键字volatile，它的意思是：被volatile
 * 修饰的变量的值，将不会被本地线程缓存，所有对该变量的读写都是直接操作共享内存，从而
 * 确保多个线程能正确的处理该变量。
 *
 * 说明：由于volatile关键字可能会屏蔽掉虚拟机中的一些必要的代码优化，所以运行效率并不是
 * 很高。因此一般建议，没有特别的需要，不要使用。也就是说，虽然可以使用 双重检查加锁
 * 机制来实现线程安全的单例，但并不建议大量采用，可以根据情况来选用。
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
