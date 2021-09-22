import java.util.Scanner;

public class Fibonacci{
  public static void main(String args[]){

  //Variables
  int length;
  float f0=0.0f, f1=1.0f, fn;
  //int f0=0, f1=1, fn; 
  int proof_3 = 23;
  Scanner input = new Scanner(System.in);

  //Intro
  System.out.println("##########################");
  System.out.println("# The Fibonacci sequence #");
  System.out.println("##########################");
  System.out.println("");
  
  //Asking the number of terms
  System.out.print("Number of terms (bigining from F0 = 0): ");
  length = input.nextInt();

  if(length<3){
   System.out.println("Please, give a number of terms greater than 3");
  } 
  else{
   //Computing the terms
   //The F0 and F1 terms
   System.out.println(f0 + ",");
   System.out.println(f1 + ",");

   for(int i=0; i<length-3; i++){
    fn=f0+f1;
    f0=f1;
    f1=fn;
    System.out.println(fn + ",");
   }  
    //The last term
    System.out.println(f0+f1);
  }
 }
}
