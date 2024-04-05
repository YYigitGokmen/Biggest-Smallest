



import java.util.Scanner;





public class BiggestSmallest {
 public static void main(String[] args) {

     Scanner scan = new Scanner(System.in);
     System.out.print("Kaç tane sayı gireceksiniz : ");
     int n = scan.nextInt();
    int[] inputs =new int[n];



       System.out.print("Lütfen " + n + " adet sayı giriniz :");
        for (int i = 0; i < n; i++) {
            inputs[i] = scan.nextInt();
        }


         System.out.println("Girdiğiniz sayılar :");
        for (int i = 0; i < n; i++) {
            System.out.println(inputs[i]);
        }
//en büyüğü

    int largest = inputs[0];
    for (int i = 1; i<n;i++){
        if (inputs[i] > largest){
            largest=inputs[i];
        }
    }

     System.out.print("Girilen en büyük sayı :"+largest);

//en küçüğü
System.out.println();

        int smallest =inputs[0];
        for (int i=1; i<n;i++){
            if (inputs[i]<smallest){
                smallest=inputs[i];
            }
        }
System.out.print("Girilen en küçük sayı :"+smallest);



 }
}
