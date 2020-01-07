package zilkiproj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class ColDemo {
public static void main(String[] args) {
	List<Questions> questions=new ArrayList<Questions>();
	questions.add(new Questions(1,"where is museum1 ?","adyar","egmore","guindy","egmore"));
	questions.add(new Questions(2,"where is museum2 ?","adyar","egmore","guindy","egmore"));
	questions.add(new Questions(3,"where is museum3 ?","adyar","egmore","guindy","egmore"));
	questions.add(new Questions(4,"where is museum4 ?","adyar","egmore","guindy","egmore"));
	questions.add(new Questions(5,"where is museum5 ?","adyar","egmore","guindy","egmore"));
	questions.add(new Questions(6,"where is museum6 ?","adyar","egmore","guindy","egmore"));
	questions.add(new Questions(7,"where is museum7 ?","adyar","egmore","guindy","egmore"));
	questions.add(new Questions(8,"where is museum8 ?","adyar","egmore","guindy","egmore"));
	questions.add(new Questions(8,"where is museum9 ?","adyar","egmore","guindy","egmore"));
	questions.add(new Questions(10,"where is museum10 ?","adyar","egmore","guindy","egmore"));
	
	System.out.println(questions);
	Questions q1=questions.get(0);
	Questions q2=questions.get(1);
	System.out.println(q1);
	System.out.println(q2);
	System.out.println(q1.equals(q2));
	String answer[]=new String[5];
	Random r=new Random();
	for(int i=0;i<5;i++) {
		int next=r.nextInt(9);
		Questions q=questions.get(next);
		System.out.println(q);
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your answer..:");
		String ans=scan.next();
		answer[i]=ans;
	}
	System.out.println(answer);
	Collections.sort(questions, new MyComparator());
	System.out.println(questions);
	TreeSet<Questions> ts=new TreeSet<Questions>(new MyComparator());
	
}
}

class MyComparator implements Comparator<Questions>{
	@Override
	public int compare(Questions o1, Questions o2) {
		return o2.compareTo(o1);
	}
}







