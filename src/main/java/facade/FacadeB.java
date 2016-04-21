package facade;

/**
 * 
 * 系统提供不同的访问路径
 *
 */
public class FacadeB {
	private Facade facade = new Facade();
	public void callMehodB()
	{
		this.facade.callMethodB();
	}
}
