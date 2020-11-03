/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tebakangka1;
import java.util.Scanner;
/**
 *
 * @author GGibran
 */
public class Random {
    int rand = (int) (Math.random()*100);
    int tebak;
    String enter;
    
    void menebak() {
        Scanner input = new Scanner(System.in);
        System.out.println("===== Selamat datang dalam program tebak angka =====\n"
                    + "Kami telah merandom angka dari 1 sampai 100\n"
                    + "Tebaklah angka berapa itu!\n");
        do {
            System.out.println("Angka tebakanmu?");
            this.tebak = input.nextInt();
            this.enter = input.nextLine();
            if (this.tebak > this.rand){
                System.out.println("Angka tebakan Anda terlalu besar! Coba lagi!\n");
            }else if (this.tebak < this.rand) {
                System.out.println("Angka tebakan Anda terlalu kecil! Coba lagi!\n");
            }else {
                System.out.println("SELAMAAAT! TEBAKAN ANDA TEPAT SEKALI\n"
                        + "NILAI YANG KAMI RANDOM ADALAH " + this.rand);
                break;
            }
        } while (this.tebak != this.rand);
    }
}
