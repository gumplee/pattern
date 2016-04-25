package memento.a;

public class Client {
	public static void main(String[] args) {
		Originator originator = new Originator();
		originator.setState("backup");
		
		
		originator.createMementor();
		originator.setState("change");
		originator.restoreMementor();
		System.out.println(originator.getState());
	}
}
