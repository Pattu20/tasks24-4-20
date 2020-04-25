import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;


public class Streamstring {
 public static void main(String args[]){
	 List<String> a = new ArrayList();
	 a.add("hi");
	 a.add("hello");
	 a.add("in");
	 a.add("whene");
	 Stream<String> s1 = a.stream();
	 List l1 = s1.map(x->x).filter(x->x.length()>4).collect(Collectors.toList());
	 System.out.println(l1);
 
 }
}