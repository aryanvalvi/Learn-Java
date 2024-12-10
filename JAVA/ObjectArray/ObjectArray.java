class Student{
    int rollno;
    String name;
    int marks;

}
class ObjectArray{

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollno = 1;
        s1.marks = 100;
        s1.name = "Arayn";

        Student s2 = new Student();
        s2.rollno = 1;
        s2.marks = 70;
        s2.name = "Harsh";

        Student s3 = new Student();
        s3.rollno = 1;
        s3.marks = 90;
        s3.name = "shruti";

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // for(int i= 0; i<students.length;i++){
        //     System.out.println(students[i].name + " "+students[i].marks);
        // }

        for(Student stud :students){
                     System.out.println(stud.name + " "+stud.marks); 
        }
    }
}