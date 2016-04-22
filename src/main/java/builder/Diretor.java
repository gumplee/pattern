package builder;

public class Diretor {
	private Builder builder;
	public Diretor(Builder builder)
	{
		this.builder = builder;
	}
	public void construct()
	{
		this.builder.setPart();
	}
}
