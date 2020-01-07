package zilkiproj;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
public class AnnoDemo {
public static void main(String[] args)throws Exception {
	Resource r=MyContainer.getResource();
	System.out.println(r.name);
}}
class Resource{
	//@In
	public String name;
}
class MyContainer{
	public static Resource getResource()throws Exception {
		Resource r=new Resource();
		Field f=r.getClass().getField("name");
		In in=f.getAnnotation(In.class);
		if(in!=null) {
			r.name="value inserted because of the annotation";
		}
		return r;
	}
}
@Retention(RetentionPolicy.RUNTIME)
@interface In{
}