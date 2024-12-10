class MultiArray{

public static void main(String a[]){
    int sum[][] = new int[3][4];
    for(int i=0;i<3;i++){
       for(int j= 0;j<4;j++){
        sum[i][j]=(int)(Math.random()*10); 
       System.out.print(sum[i][j]+"    ");

}
System.out.println();
    }


    for(int n[]:sum){
        for(int m:n){

            System.out.print(m);
        }
        System.out.println();
    }
}
}