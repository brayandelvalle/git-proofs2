import java.util.Scanner;

public class Din_Vector{
  public static void main(String args[]){

  int length;
  Scanner inputInt = new Scanner(System.in);                //For the length of the vector
  Scanner inputFlo = new Scanner(System.in);                //For the elements in the vector
  int proofNUmber2 = 11;
  int proofNUmber2 = 13;
  int proofNUmber2 = 17;
 
  
  System.out.print("Length of the vector: ");
  length = inputInt.nextInt();
  float vector[] = new float[length];                       //It's needed first to know the length of the vector
  
  //Now we are going to fill the vector with floats
  for(int i=0; i<length; i++){
   System.out.print("Write the " + (i+1) + " element: " );
   vector[i] = inputFlo.nextFloat();                        //The scanner element "iputInt" could be used too
  } 
  
  //Printing the vector
  System.out.println();
  System.out.println("###################################");

  System.out.println("The elements are: ");
  for(int i=0; i<length; i++){
   System.out.println((i+1) + "). " + vector[i]);
  }

  System.out.println("###################################");
  
 }
}
