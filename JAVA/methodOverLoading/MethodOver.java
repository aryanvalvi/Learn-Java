class Methods{
// in this we have two methods with the same name but should have diff args

public int Add(int a,int b){
return a+b;
    
}
public int Add(int a,int b,int c){

return a+b+c;
}

}


class MethodOverLoding {
public static void main(String a[]){
    Methods obj = new Methods();
    int result = obj.Add(5, 6) ;
    System.out.println(result);



}

}


