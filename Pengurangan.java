/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathgame;

/**
 *
 * @author lenovo
 */
public class Pengurangan extends Penjumlahan {
    private int random1;
    private int random2;
    private int skor = getSkor();
    private int lives = getLives();
    private int level = getLevel() ;
    
    
    private void setWinStatus(int x){
        this.win=x;
    }
    
    @Override
    public int getWinStatus(){
        return win;
    }
    
    
    @Override
    public void setLevel1(){
    random1 = setrandom1();
    random2= setrandom1();
    
    System.out.println("Hasil dari : "+ random1 +" - "+ random2 + " adalah");
    hasil  = random1 - random2;
    System.out.println("Hasil =" + hasil);
    jawab = input.nextInt();   
    
    if (jawab == hasil & level == 1 ){
       
       skor = skor + 40;
       System.out.println("Skor :"+ skor);
       System.out.println("Lives ; " + lives);
       if(skor>101){
           level= level +1;
           setLevel2();}
       else{setLevel1();}
       
     
   }else if(jawab!=hasil & level ==1 ){
       skor= skor-1;
       lives=lives-1;
       System.out.println("Lives ; " + lives);
       System.out.println("Skor "+ skor);
       if(lives == 0){setWinStatus(0);}
       else if (lives > 0 ){setLevel1();}       
       
   }
}
    @Override
    public void setLevel2(){
    random1 = setrandom2();
    random2 = setrandom2();
    
    if(random1>=0){
        System.out.print("Hasil dari : "+random1+" - "); 
    }else{
        System.out.print("Hasil dari : "+"("+random1+") "+" - ");
    }
    if(random2>=0){
        System.out.print(random2 + " Adalah "); 
    }else{
        System.out.println("("+random2+")"+ " Adalah ");
    }
    hasil  = random1 - random2;
    System.out.println("Hasil " + hasil);
    jawab = input.nextInt();
   if (jawab == hasil & level == 2 ){
       skor = skor + 40;       
       System.out.println("Skor :"+ skor);
       System.out.println("Lives ; " + lives);
       
       if(skor>200){
           level= level +1;
           setLevel3();}
       else{setLevel2();}
   }else if(jawab!=hasil & level ==2 ){
       skor= skor-1;
       lives=lives-1;
       System.out.println("Lives ; " + lives);
       System.out.println("Skor "+ skor);
       if(lives == 0 ){setWinStatus(0);}
       else if (lives > 0 ){setLevel2();}       
       
   }
}
    @Override
      public void setLevel3(){
    random1 = setrandom3(); 
    random2 = setrandom3();
    
 ;
    if(random1>=0){
        System.out.print("Hasil dari : "+random1+" - "); 
    }else{
        System.out.print("Hasil dari : "+"("+random1+") "+" - ");
    }
    if(random2>=0){
        System.out.print(random2 + " Adalah "); 
    }else{
        System.out.println("("+random2+")"+ " Adalah ");
    }
    hasil  = random1 + random2;
    System.out.println("Hasil " + hasil);
    jawab = input.nextInt();
   if (jawab == hasil & level == 3 ){
       System.out.println("Skor :"+ skor);
       System.out.println("Lives ; " + lives);
       skor = skor + 40;
       if(skor>=300){setWinStatus(1);}
       else{setLevel3();}
     
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
