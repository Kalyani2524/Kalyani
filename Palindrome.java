import java.util.Scanner;
public class Palindrome{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String input=sc.nextLine();
String reversed = new StringBuilder(input).reverse().toString();
if(input.equals(reversed)){
System.out.println("is a palindrome");
}
else
{
System.out.println("is not a palindrome");
}
}
}


