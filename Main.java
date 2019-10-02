import java.util.*;
public class Main{
  public static void main(String args[]){
    
    Student stud1=new Student("IT9087567","Kamal",50,60,70);
    stud1.calaverage();
    stud1.showDetail();

  }
}

class Student{
  private String id;
  private String name;
  private int mark_1;
  private int mark_2;
  private int mark_3;
  private float average;
  
  
  public Student(String id, String name, int mark_1, int mark_2, int mark_3){
    this.id=id;
    this.name=name;
    this.mark_1=0;
    this.mark_2=0;
    this.mark_3=0;
    
  }
  public void showDetail(){
  
  System.out.println("Student ID "+id);
  System.out.println("Student name "+name);
  System.out.println("Average mark is "+average);
  
}
  public void calaverage(){
    Scanner ob1=new Scanner(System.in);
    mark_1=ob1.nextInt();
    mark_2=ob1.nextInt();
    mark_3=ob1.nextInt();
    
    int total=mark_1+mark_2+mark_3;
    average=total/3;
  }
}
