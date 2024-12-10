import java.util.Scanner;
public class InsertionSort {

static class Inserter{

    Inserter(int[] nums){
        System.out.println("behen ke lavde tere nums before sorted");
        for(int num:nums){
            System.out.print(num);
        }

        for(int i =1;i<nums.length;i++){
            int currentvalue = nums[i];

            int j = i-1;
            while (j>=0 && nums[j]>currentvalue) {
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = currentvalue;
        }





        System.out.println("behen ke lavde tere nums after sorted");
        for(int num:nums){
            System.out.print(num);
        }


        
    }

}

public static void main(String[] args) {

   Scanner scan = new Scanner(System.in);
   
   System.out.println("Behene ke lavde kitna digit ka array banavu");
   int size = scan.nextInt();

   int[]  nums = new int[size];
        System.out.println("Behen ke lavde array me data dal");

        for(int i = 0;i<size;i++){
            int data = scan.nextInt();
            nums[i] =data;
        }

Inserter abc =new Inserter( nums);

}



    
}
