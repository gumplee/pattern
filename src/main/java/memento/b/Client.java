package memento.b;

public class Client {
	public static void main(String[] args) {
		Originator o = new Originator();
		Caretaker c = new Caretaker();
		c.setMementor(o.createMementor());
		o.restoreMementor(c.getMementor());
	}
}
