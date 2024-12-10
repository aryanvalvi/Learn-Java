
import java.util.Scanner;
public class BubbleSort {
static class Bubblesorter {
    public Bubblesorter(int[] nums){
        System.out.println("here is array before sorted");
        for(int num:nums){
            System.out.print(num + " ");
        }

        int temp ;
        for (int i=0;i<nums.length;i++){
            for(int j = 0; j<nums.length-1;j++){
              
                if(nums[j]>nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;


                }
            }
        }

        System.out.print("here is array after sorted");
          for(int num:nums){
            System.out.print(num + " ");
        }

    }


}

    public static void main(String[]  args){
         
        System.out.println("Bhene ke lavde array ka size bata");
        Scanner scan = new Scanner(System.in);

        int size  = scan.nextInt();
        int[] nums  =  new int[size];

        //adding data into a array
        for(int i=0; i<nums.length;i++){
            System.out.println("Bhene ke lavde array me elements dal");
          int data = scan.nextInt();

            nums[i] = data;
        }

        Bubblesorter abc = new Bubblesorter(nums);



    




    }
    
}
