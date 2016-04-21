package composite;

public class Client {
	public static void main(String[] args) {
		Component root = new Composite("root");
		
		Component brA = new Composite("brA");
		Component brB = new Composite("brB");
		
		Component leaf = new Leaf("leaf");
		
		
		root.add(brA);
		root.add(brB);
		
		brA.add(leaf);
		
		display(root);
	}
	
	
	public static void display(Component root)
	{
		for(Component rComponent : root.getChild())
		{
			if (rComponent instanceof Leaf) {
				System.out.println(rComponent.getName());
			}
			else {
				System.out.println(rComponent.getName());
				display(rComponent);//Í¸Ã÷Ä£Ê½
			}
		}
	}
}
