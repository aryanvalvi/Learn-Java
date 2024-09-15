class Switch

{




public static void main(String a[]){

    int n = 2;

    switch (n) {

        case 1:
        System.out.println("Monday");
        break;
        case 2:
        System.out.println("Tuesday"); // the problem with a switch statement if it mathches with eg 2 then it will print all the rem
        //remaining code down
        //solution is use to use Break
         break;
        case 3:
        System.out.println("Wenesday");
         break;
        case 4:
        System.out.println("Thirsday");
         break;
        case 5:
        System.out.println("Friday");
         break;
        case 6:
        System.out.println("Saturday");
         break;
        case 7:
        System.out.println("Sunday");
         break;
         //if non of the case matching you can use difault case
         default:
         System.out.println("Bhadve");
    }


}
}
