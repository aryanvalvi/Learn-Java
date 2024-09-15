class Loop
{
public static void main(String a []){
int king = 10;

// while (king<6) {
//     System.out.println("hi" +king);
//     king++;
// }


// nested while loop

// while (king<6) {
//     System.out.println("hi" +king);
//     int j = 0;
//     while (j<=3) {
//         System.out.println("Hello");
//         j++;
//     }
//     king++;
// }


// now what if you  want to execute a statement 1 time even its false 


// do {
//     System.out.println("hi" +king);
//     king++;
// }while (king<6);

// }


// now nothing fancy just we modifying the while 

// int king2 = 10;
// while (int king2 = 10;king<6; king++;) {
//     System.out.println("hi" +king);
//     king++;
// }
// for (int king2 = 1;king2<6; king2++) {
//     System.out.println("hi" +king2);
//     king++;
// }

//inner loop
for (int king2 = 1;king2<5; king2++) {
    System.out.println("DAY" +king2);
    for(int j=1;j<=9;j++){
        System.out.println("   "+ (j+8)+"  -  "+(j+9));
    }

    king++;
}
}


}