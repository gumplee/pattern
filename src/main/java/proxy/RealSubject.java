package proxy;

public class RealSubject implements Subject {
	private String name;
	public RealSubject(Subject subject,String name)throws Exception
	{
		if (subject == null) {
			throw new Exception("���ܴ�������");
		}else {
			this.name = name;
		}
	}
	@Override
	public void request() {
		System.out.println(name + "RealSubject request");
	}

}
