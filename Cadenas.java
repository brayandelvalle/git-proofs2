import java.util.Scanner;

public class Cadenas{
  public static void main(String args[]){
  
  String name = "", name_part = "";  
  int len, from, to;
  Scanner entrada = new Scanner(System.in);

  System.out.print("Name: ");
  name = entrada.nextLine();
  System.out.println("The character '" + name + "' has " + name.length() + " characters");

  System.out.println("Now, from what character to what character do you want to see?");
  System.out.print("from: ");
  from = entrada.nextInt();
  System.out.print("to: ");
  to = entrada.nextInt();

  System.out.println("The new character is '" + name.substring(from,to) + "'");
 }                 
}
