package Question1;
public interface Z extends X, Y{

	void zMethod();
}



class ZImpl implements Z{
	
	@Override
	public void sleep() {
		System.out.println("Default method of X interface overridden inside ZImpl");
	}
	
	@Override
	public void run() {
		System.out.println("Run method of X interface overridden in ZImpl");
	}
	
	@Override
	public void speak() {
		System.out.println("Speak method of Y interface overridden in ZImpl");
	}
	
	@Override
	public void zMethod() {
		System.out.println("zMethod of Z interface overridden in ZImpl");
	}
	
}