class Jagged{

public static void main(String a[]){
int sum[][] = new int[3][]; //Jagged Array
sum[0] = new int[3];
sum[1] = new int[1];
sum[2] = new int[4];



for(int i=0; i<sum.length;i++) {
for(int j = 0; j<sum[i].length;j++){
    sum[i][j] = (int)(Math.random()*10);
    System.out.print(sum[i][j]+" ");
}
System.out.println();

}

for( int n[] :sum){
for(int m :n){
    System.out.print(m +" ");

}
System.out.println();

}



}



}