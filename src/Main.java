import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner= new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int sayi=scanner.nextInt();
        System.out.println(asalMi(sayi,2));

    }
    static String asalMi(int sayi,int bolen) {

        while (sayi!=bolen){
            if(sayi%bolen==0){
                return sayi+" Asal değildir.";
            }
            return asalMi(sayi,bolen+1);
        }
        return sayi+ " Asaldır";
    }


}
