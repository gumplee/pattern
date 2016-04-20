package iterator;

public class Client {
	public static void main(String[] args) {
		Aggregate<String> aggregate = new ConcreteAggregate<String>();
		aggregate.add("123");
		aggregate.add("nishi");
		aggregate.add("test");
		IIterator<String> iIterator = aggregate.iterator();
		iIterator.remove();
		while(iIterator.hasNext())
		{
			System.out.println(iIterator.next());
		}
	}
}
