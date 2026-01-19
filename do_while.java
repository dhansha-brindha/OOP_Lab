import java.util.*;
public class do_while{
public static void main(String args[]){
int maths,phy,eng,che,compsc;
double finalscore;
boolean result;
Scanner marks = new Scanner(System.in);
do{
System.out.println("enter marks for maths:");
maths=marks.nextInt();
System.out.println("enter marks for phy:");
phy=marks.nextInt();
System.out.println("enter marks for chemistry:");
che=marks.nextInt();
System.out.println("enter marks for english:");
eng=marks.nextInt();
System.out.println("enter marks for compsc:");
compsc=marks.nextInt();
finalscore=(maths+eng+che+phy+compsc)/5;
if (finalscore>90){
System.out.println("Excellent");
}
else if (finalscore>80){
System.out.println("V.good");
}
else if (finalscore>60){
System.out.println("good");
}
else if (finalscore>40){
System.out.println("average");
}
else {
System.out.println("poor");
}
System.out.println("Anymore students?");
result=marks.nextBoolean();
}
while(result);
}
}