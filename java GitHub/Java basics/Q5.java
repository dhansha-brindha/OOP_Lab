import java.util.Scanner;
public class Q5{
public static void main(String arggs[]){
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
int original = num;
int rev = 0;

while(num!=0){
int digit = num%10;
rev = rev*10 +digit;
num = num/10;
}
if(original==rev)
System.out.println("Palindrome");
else
System.out.println("Not Palindrome");
}
}