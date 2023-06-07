package com.Lidia.PBO.Pertemuan6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try{
            System.out.println("Masukkan bilangan: ");
            int bilangan1 = input.nextInt();

            System.out.println("Masukkan pembaginya: ");
            int bilangan2 = input.nextInt();

            int hasil = bilangan1/bilangan2;
            System.out.println(bilangan1 + " / " + bilangan2 + " = " + hasil + "(dibulatkan)");
        }
        catch (ArithmeticException | InputMismatchException e) {
            System.out.println("Eror, Tidak bisa di proses : (");
        }
    }

}
        //Multiple Cach
//        catch (ArithmeticException e){
//            System.out.println("Eror weh, Tidak bisa diproses!");
//        }
//        catch (InputMismatchException e){
//            System.out.println("Masukkan angka saja yoo : )");
//        }
//        System.out.println("Proses sudah selesai yoo :)");
// }
//}
