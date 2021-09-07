package main;
import java.util.*;
public class Main {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.println("----kéo=0---búa=1----bao=2----");
  int user = input.nextInt();
  // ---user chon-----
  if (user ==0){
   System.out.print("kéo vs ");
  }
  else if (user==1){
   System.out.print("búa vs ");
  }
  else if (user==2){
   System.out.print("bao vs ");
  }
   Random game = new Random();
   int game1 = game.nextInt(3);
   //------may chon--------
  if (game1 ==0){
   System.out.print("kéo ===>");
  }
  else if (game1==1){
   System.out.print("búa ===>");
  }
  else if (game1==2){
   System.out.print("bao ===>");
  }
   // -----TH1-------
    if (game1== 0 && user==0){
     System.out.println(" hòa");
    }
    else if (game1==0 && user==1){
     System.out.println(" you win");
    }
    else if (game1==0 && user==2){
     System.out.print(" you lose");
    }
    // -------TH2----------
    if (game1==1 && user==0){
     System.out.print(" you lose");
    }
    else if (game1==1 && user==1){
     System.out.print(" hòa");
    }
    else if (game1==1 && user==2){
      System.out.print(" you win");
    }
    // -------TH3--------
  if (game1==2 && user==0){
   System.out.print(" you win");
  }
  else if (game1==2 && user==1){
   System.out.print(" you lose");
  }
  else if (game1==2 && user==2){
   System.out.print(" hòa");
  }


 }
}
