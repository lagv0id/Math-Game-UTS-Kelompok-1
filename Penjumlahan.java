/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathgame;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Penjumlahan extends MathGame{
   
    private String nama;
    private int level =1 ;
    public int hasil;
    public int jawab;
    private int random1;
    private int random2;
    private int randomlv1 = ((int)(Math.random()*10)+0);
    private int randomlv2;
    private int randomlv3;


    Scanner input = new Scanner (System.in);

    //setter    
    private void setSkor(int skor){
        this.skor=skor;
    }
    private void setLives(int lives){
        this.lives=lives;
    }
    private void setLevel(int level){
        this.level=level;
    }
    private void setWinStatus(int x){
        this.win=x;
    }
   
   //getter
    public int getSkor(){
        return skor;
    }
    public int getLives(){
        return lives;
    }
    public int getLevel(){
        return level;
    }
    public String getNama(){
        return nama;
    }
    public int getWinStatus(){
        return win;
    }
    
  
    
              
    //menset  nilai randomm tiap level agar selalu generate         
    public int setrandom1(){
    randomlv1 = ((int)(Math.random()*10)+0);
    return randomlv1;
   }
    public int setrandom2(){
    randomlv2 = ((int)(Math.random()*-10)-1);
    return randomlv2;
   }
    public int setrandom3(){
    randomlv3 = ((int)(Math.random()*10)-(10));
    return randomlv3;
   }
   
  // penjumlahan set level 1
public void setLevel1(){
    random1 = setrandom1();
    random2 = setrandom1();
    
    System.out.println("Hasil dari : "+ random1 +" + "+ random2 + " adalah");
    hasil  = random1 + random2;
    System.out.println("Hasil " + hasil);
    // input jawaban
    jawab = input.nextInt();
    // jika jawaban benar 
   if (jawab == hasil & level == 1 ){
       skor = skor + 40;
       System.out.println("Skor :"+ skor);
       System.out.println("Lives ; " + lives);
       // skema jika naik level
       if(skor>101){
           level= level +1;
           setLevel2();}
       else{setLevel1();}
       
     // jika jawaban salah 
   }else if(jawab!=hasil & level ==1 ){
       skor= skor-1;
       lives=lives-1;
       System.out.println("Lives ; " + lives);
       System.out.println("Skor "+ skor);
       // jika llives sudah habis
       if(lives == 0 ){setWinStatus(0);} //Jika lives habis, maka win = 0, nilai win kemudian digunakan untuk menentukan end screen yang muncul nanti
       else if (lives > 0 ){setLevel1();}       
       
   }
}
 // penjumlahan set level 2
  public void setLevel2(){
    random1 = setrandom2();
    random2 = setrandom2();
    // menset bila output yang keluar negatif maka output diberi tannda kurung ()
    if(random1>=0){
        System.out.print("Hasil dari : "+random1+" + "); 
    }else{
        System.out.print("Hasil dari : "+"("+random1+") "+" + ");
    }
    if(random2>=0){
        System.out.print(random2 + " Adalah "); 
    }else{
        System.out.println("("+random2+")"+ " Adalah ");
    }

    hasil  = random1 + random2;
    System.out.println("Hasil " + hasil);
    //inputan jawaban 
    jawab = input.nextInt();
    //jika jawaban benar
   if (jawab == hasil & level == 2 ){
       skor = skor + 40;       
       System.out.println("Skor :"+ skor);
       System.out.println("Lives ; " + lives);
       //skema naik level
       if(skor>200){
           level= level +1;
           setLevel3();}
       else{setLevel2();}
       //jika jawaban salah
   }else if(jawab!=hasil & level ==2 ){
       skor= skor-1;
       lives=lives-1;
       System.out.println("Lives ; " + lives);
       System.out.println("Skor "+ skor);
       // jika lives sudah habis
       if(lives == 0 ){setWinStatus(0);}
       else if (lives > 0 ){setLevel2();}       
       
   }
}
  //penjumlahan set level 3
  public void setLevel3(){
    random1 = setrandom3(); 
    random2 = setrandom3();
    // menset bila output yang keluar negatif maka output diberi tannda kurung ()
    if(random1>=0){
        System.out.print("Hasil dari : "+random1+" + "); 
    }else{
        System.out.print("Hasil dari : "+"("+random1+") "+" + ");
    }
    if(random2>=0){
        System.out.print(random2 + " Adalah "); 
    }else{
        System.out.println("("+random2+")"+ " Adalah ");
    }
    System.out.println("Hasil " + hasil);
    // inputan jawaban
    jawab = input.nextInt();
    // skema jika game telah selesai
   if (jawab == hasil & level == 3 ){
       System.out.println("Skor :"+ skor);
       System.out.println("Lives ; " + lives);
       skor = skor + 40;
       // skema setellah selesai skor lebih dari 300 
       if(skor>=300){setWinStatus(1);}
       else{setLevel3();}
    // jika jawaban salah 
   }else if(jawab!=hasil & level ==3 ){
       skor= skor-1;
       lives=lives-1;
       System.out.println("Lives ; " + lives);
       System.out.println("Skor "+ skor);
       if(lives == 0 ){setWinStatus(0);}
       else if (lives > 0 ){setLevel3();}       
       
   }
}
}


