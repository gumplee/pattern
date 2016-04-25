package memento.c;

public class Client {
	public static void main(String[] args) {
		Originator originator = new Originator();
		originator.setState1("1");
		originator.setState2("2");
		originator.setState3("3");
		
		Memento memento = originator.createMemento();
		System.out.println(originator);
		originator.setState1("4");
		originator.setState2("5");
		originator.setState3("6");
		System.out.println(originator);
		originator.restoreMemento(memento);
		System.out.println(originator);
	}
}
