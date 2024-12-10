class Computer{
public void Name(){
    System.out.println("Hello my name is Computer");
}
public int Cost(int rs){
 
       
    return rs;
}
}



public class Method{
    public static void main(String a[]){

    Computer comp = new Computer();
int cost=  comp.Cost(1000);
System.out.println(cost);



}
}