
public class lec1 {

    // data of 5 students:{roll no , name , marks}    
    int[] rno = new int[5];
    String[] name = new String[5];
    float[] marks = new float[5];
    public static void main(String[] args){


Student Aryan = new Student();
Aryan.marks = 80f;
Aryan.name = "Aryan";
Aryan.rno = 20;

System.out.println(Aryan);
System.out.println(Aryan.name);
System.out.println(Aryan.marks);
System.out.println(Aryan.rno);


Student Rahul = new Student();
System.out.println(Rahul.name);

Student Tim = new Student(90,"tim",90f);
System.out.println(Tim.marks);


//creating a class

}

}
class Student{
   int rno;
   String name;
   float marks;

   Student(){
    this.rno = 10;
    this.name = "Rahul";
    this.marks = 10f;
   }

   Student(int roll,String naam, float mark){
    this.rno = roll;
    this.name = naam;
    this.marks = mark;
   }
}
class Teacher {

     


}