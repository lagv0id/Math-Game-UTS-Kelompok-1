/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathgame;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



/**
 *
 * @author lenovo
 */
public class MathGame{
    
        public int win;
        protected int skor = 0;
        protected int lives = 3;
        private String nama; 
        public String pilihan;       
        
        private void setNama(String nama){
        this.nama = nama;
        }
        
        public String getNama(){
        return nama;
        }
        
        public int getSkor(){
        return skor;
        }
        
        private int getWinStatus(){
        return win;
        }
        
        private void setpilihanmenu() throws IOException{
            
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
        
            //input
            System.out.println("==================");
            System.out.println("Game Math");
            System.out.println("==================");
            System.out.println("Masukan Nama Anda    : ");
            String nama = br.readLine();
            setNama(nama);
            System.out.println("Hello :"+ getNama());
            
            Scanner input = new Scanner (System.in);
            
            System.out.println("==================");
            System.out.println("Game Math");
            System.out.println("==================");
            System.out.println("Menu :");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Keluar");
            System.out.println("pilih no menu ");
            pilihan = input.nextLine();
            
            Penjumlahan j1= new Penjumlahan();
            Pengurangan k1= new Pengurangan();
            
            if (null == pilihan){
                setpilihanmenu();          
            } else switch (pilihan) {
            case "1":
                j1.setLevel1();
                System.out.println("This is the result screen, "+getNama());
                if(j1.getWinStatus()==0){
                    System.out.println("Aduh kasian, "+getNama()+"! Better luck next time!");
                } else if (j1.getWinStatus()==1){
                    System.out.println("Good job, score: " + j1.getSkor());
                }
                break;
            case "2":
                k1.setLevel1();
                System.out.println("This is the result screen, "+getNama());
                if(k1.getWinStatus()==0){
                    System.out.println("Aduh kasian, "+getNama()+"! Better luck next time!");
                } else if (k1.getWinStatus()==1){
                    System.out.println("Good job, score: " + k1.getSkor());
                }
                break;
            case "3":
                System.exit(0);
            default:
                setpilihanmenu();
                break;
            }
            
        }
        

        
    public static void main(String[] args )throws IOException {
        
        MathGame mg1= new MathGame();          
        
        mg1.setpilihanmenu();
    }
    
}
