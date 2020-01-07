package zilkiproj;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
class Fruits{
	int sno;
	String name;
	float price;
	public Fruits(int sno, String name, float price) {
		this.sno = sno;		this.name = name;		this.price = price;
	}
	
}
public class StreamDemo {
	public static void main(String[] args) {
		List<Fruits> list=new ArrayList<Fruits>();
		list.add(new Fruits(1,"mango",300));
		list.add(new Fruits(2,"apple",200));
		list.add(new Fruits(3,"banana",100));
		
		for(Fruits s:list) {
			System.out.println(s.name);
		}
		
		Stream<Fruits> mystream=list.stream().filter(p->p.price>=200);
		mystream.forEach(s->System.out.println(s.name));
		
		
				
	}
}
