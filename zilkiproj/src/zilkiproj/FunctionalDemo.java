package zilkiproj;

public class FunctionalDemo {
	public FunctionalDemo() {
		// TODO Auto-generated constructor stub
	}
	public FunctionalDemo(String n) {
		System.out.println("cons called.....");
	}
	public void met(String s) {
		System.out.println("met method called....");
		//return s;
	}
	public void runlike() {
		System.out.println("run method logic....");
	}
	public static void main(String[] args) {
		new Thread(new FunctionalDemo()::runlike).start();
		
		//lambda
		
		Runnable runn=()->{
			System.out.println("hello world....");
		};
		
		new Thread(runn).start();
		
		new Hello() {
			@Override
			public void sayHello(String name) {
				// TODO Auto-generated method stub
				//return null;
			}
		}.sayHello("ramu");
		
		Hello hello=new FunctionalDemo()::met;
		Hello hello2=(n)->{System.out.println("met method logic...."+n);};
		hello2.sayHello("ramu ramu ramu");
		hello.sayHello("ramu");
	}
}
class HelloImpl implements Hello{
	@Override
	public void sayHello(String name) {
		// TODO Auto-generated method stub
		//return null;
	}
}
interface Hello{
	public void sayHello(String name);
}