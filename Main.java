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
  private int mark1;
  private int mark2;
  private int mark3;
  private float average;
  
  
  public Student(String id, String name, int mark1, int mark2, int mark3){
    this.id=id;
    this.name=name;
    this.mark1=0;
    this.mark2=0;
    this.mark3=0;
    
  }
  public void showDetail(){
  
  System.out.println("Student ID "+id);
  System.out.println("Student name "+name);
  System.out.println("Average mark is "+average);
  
}
  public void calaverage(){
    Scanner ob1=new Scanner(System.in);
    mark1=ob1.nextInt();
    mark2=ob1.nextInt();
    mark3=ob1.nextInt();
    
    int total=mark1+mark2+mark3;
    average=total/3;
  }
}