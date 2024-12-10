class Calculator{
    public int add(int n1,int n2){
        System.out.println("in Add");
        return n1 + n2;
    }
}

public class First
{
    public static void main(String a[]){
        Calculator cal = new Calculator() ;
    //   cal.add(4,5);
   int result =   cal.add(4,5);;
        System.out.println("Hello");
        System.out.println(result);
    }
}