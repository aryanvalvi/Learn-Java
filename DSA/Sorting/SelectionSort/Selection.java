
import java.util.Scanner;
public class Selection {
    
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Print the size of the array");
        int size = scan.nextInt();
        System.out.println("Size of an array is "+size);
        int[] arryNumber = new int[size];



        //taking value from user
        for(int i=0;i<size;i++){
            System.out.println("Enter a number to insert into array");
            int num = scan.nextInt();
            arryNumber[i] = num;
         System.out.println(arryNumber[i]);
        }

        //printing that fucking value
        for (int i  = 0; i<size;i++){
            System.out.println(
                arryNumber[i]

            );
        }


        //logic for selection sorting

        for(int i = 0; i<size-1;i++){
        
            int mini = i;
            for(int j = i; j<size;j++){
        if( arryNumber[j] <arryNumber[mini]){
            mini = j;
        }
        
    }
    int temp = arryNumber[mini];
    arryNumber[mini] = arryNumber[i];
    arryNumber[i] = temp;

    
    
    
    
}
for (int i = 0; i <size; i++){
            System.out.println("sorted array is"+ arryNumber[i]);

        }






    }



}
