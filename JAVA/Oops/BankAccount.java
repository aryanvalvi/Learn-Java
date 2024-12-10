 class Student {
String name;
int age;


public void write(){
    System.out.println("Hello from student class");
    System.out.println(this.name);
    System.out.println(this.age);
}

// normal constructor
Student(){
    System.out.println("Constructor called");
}

//parameterized constructor

Student(String name , int age){
this.name = name;
this.age = age;
}

// copy Constructor
Student(Student s2){
    this.name = s2.name;
    this.age = s2.age;
}
}

public class BankAccount {



    public static void main(String[] args){
        Student s = new Student();
        //Student() this is constructor , this have a work to create a object
        s.name = "Aryan";
        s.age = 23;
        s.write();
        Student s2 = new Student("Virat" , 33);
        
         s2.write();

         // copy constructor
         Student s3 = new Student(s2);
         s3.write();
    }


}
