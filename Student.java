import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
 
public class Student {
 public static void main(String a[]){
     List<Student> s = new ArrayList<>();
	 s.add(new Student(1,"sow",90));
	 s.add(new Student(2,"nan",80));
	 s.add(new Student(3,"gan",91));
Student maxmark=s.stream().max(Comparator.comparingInt(Student::getMark)).get();
	System.out.println(maxmark);
	Student minmark=s.stream().min(Comparator.comparingInt(Student::getMark)).get();
	System.out.println(minmark);
		int totmark=s.stream().mapToInt(Student::getMark).sum();
	System.out.println(totmark);
 }
 
 private Integer  id;
 private String name;
 private Integer mark;
 public Integer getId(){
     return id;}
     public void setId(Integer id){this.id=id;}
 public String getName(){
     return name;}
     public void setName(String name){this.name=name;}
   public Integer getMark(){
     return mark;}
     public void setMark(Integer mark){this.mark=mark;}

    
    public Student(Integer id, String name, Integer mark) {
        super();
        this.id = id;
        this.name = name;
        this.mark = mark;
    }
 

    public String toString() {
 
        return "name: "+ this.id +" | name: "+ this.name +" | mark: "+this.mark;
    }
}