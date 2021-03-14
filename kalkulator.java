package pbo1;
import java.util.Scanner;

public class kalkulator {

    public static void main (String[] args){
        float a1,a2, hasil;
        char opr;
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan angka pertama : ");
        a1 = sc.nextFloat();
        System.out.println("Masukkan angka kedua : ");
        a2 = sc.nextFloat();
        System.out.println("Pilih Operator : ");
        opr = sc.next().charAt(0);
        switch (opr){
            case '+':
                hasil = a1 + a2;
                System.out.println("Hasil Operasinya adalah : "+ hasil);
                break;
            case '-':
                hasil = a1 - a2;
                System.out.println("Hasil Operasinya adalah : "+ hasil);
                break;
            case '*':
                hasil = a1 * a2;
                System.out.println("Hasil Operasinya adalah : "+ hasil);
                break;
            case '/':
                hasil = a1 / a2;
                System.out.println("Hasil Operasinya adalah : "+ hasil);
                break;
            default:
                System.out.println("Kesalahan dalam operasi");
                break;
        }

    }
    
}
