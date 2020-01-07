package zilkiproj;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Items{
	int ino;
	String name;
	float price;
	public Items(int ino, String name, float price) {
		this.ino = ino;	this.name = name;this.price = price;
	}
}
public class StreamDemo2 {
	public static void display(Items i) {
		System.out.println(i.name);
	}
public static void main(String[] args) {
	List<Items> list=new LinkedList<Items>();
	list.add(new Items(1,"spring",30));
	list.add(new Items(1,"nut",50));
	list.add(new Items(1,"bolt",60));
	
	//Stream<Object> mystream=
	//list.stream().filter(p->p.price>30).limit(1).map(i->i.name).forEach(i->System.out.println(i));
	List streamList=list.stream().filter(p->p.price>30).limit(1).map(i->i.name).collect(Collectors.toList());
	
	//mystream.forEach(new MyConsumer()); //- external class
		/*
		 * mystream.forEach(new Consumer<Items>() {
		 * 
		 * @Override public void accept(Items t) { System.out.println(t.name); } });//-anonymous inner class
		 */
	//mystream.forEach(StreamDemo2::display);//method referencing
	streamList.forEach(i->System.out.println(i));//lambdas	
}

}
class MyConsumer implements Consumer<Items>{
	@Override
	public void accept(Items t) {
		System.out.println(t.name);
	}
}










