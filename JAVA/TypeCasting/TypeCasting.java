class TypeCasting
{
public static void main(String a[]){
//we cannot change the value of from  integer to a byte
//but we can change the byte to int
//to use the value or for changing the integrt to a byte we explicilty mention there 
//eg
int ab = 257; // so if u look te ab value which is now in integer which 257 its okay
//but 
byte  b =(byte)ab; // we are converting it to a byte and byte can hold up to 256 then it perform modulos operation
System.out.println(b);

// so now if convert float to a int it will lose the ._ number and give us a value
float king = 10.10f;
int gandu = (int)king;
System.out.println(gandu);



}


}