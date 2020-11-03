/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tebakangka2;

import java.util.Scanner;

/**
 *
 * @author GGibran
 */
public class Random2 {
    int rand = (int) (Math.random()*100);
    int tebak;
    String enter;
    int score = 100;
    
    void menebak() {
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("===== Selamat datang dalam program tebak angka =====\n"
                    + "Kami telah merandom angka dari 1 sampai 100\n"
                    + "Tebaklah angka berapa itu!\n");
        System.out.println("Aturan-aturan:\n"
                + "1. Anda dibekali score " + this.score + "\n"
                + "2. Score berkurang 2 setiap Anda menebak salah\n"
                + "3. Game berakhir saat score habis\n"
                + "4. Jika Anda berhasil menebak angka tidak lebih dari 5 tebakan, poin Anda bertambah 50\n");
        do {
            sum ++;
            System.out.println("Angka tebakanmu?");
            this.tebak = input.nextInt();
            this.enter = input.nextLine();
            if (this.tebak != this.rand && this.score <= 0) {
                System.out.println("GAME OVER");
                System.out.println("Score Anda: 0");
                break;
            }else if (this.tebak > this.rand){
                System.out.println("Angka tebakan Anda terlalu besar! Coba lagi!\n");
                this.score -= 2;
            }else if (this.tebak < this.rand) {
                System.out.println("Angka tebakan Anda terlalu kecil! Coba lagi!\n");
                this.score -= 2;
            }else {
                System.out.println("SELAMAAAT! TEBAKAN ANDA TEPAT SEKALI\n"
                        + "NILAI YANG KAMI RANDOM ADALAH " + this.rand);
                System.out.println("Jumlah tebakan: " + sum);
                System.out.println("Score Anda: " + this.score);
                if (sum <= 5){
                    System.out.println("Bonus: 50");
                    this.score += 50;
                }
                System.out.println("Total Score Anda: " + this.score);
                break;
            }
        } while (this.tebak != this.rand);
    }
}
