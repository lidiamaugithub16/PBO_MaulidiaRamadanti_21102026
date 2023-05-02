package com.Lidia.PBO.Pertemuan2;

import java.util.Scanner;
public class tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        String user_26 = "lidia";
        String pass_26 = "21102026";

        System.out.println("Masukkan Username Anda : ");
        String user = input.nextLine();
        System.out.println("Masukkan Pasword Anda : ");
        String pass = input.nextLine();

        if (user.equals(user_26) && pass.equals(pass_26)) {
            System.out.println("Login berhasil silahkan masuk");
        } else if (user != (user_26) && pass.equals(pass_26))
        {
            System.out.println("Username anda salah");
        } else if (user.equals(user_26) && pass != (pass_26))
        {
            System.out.println("Password yang anda masukkan salah");
        } else {
            System.out.println("Silahkan login dengan memasukkan username dan password yang sah!");
        }
    }
}

