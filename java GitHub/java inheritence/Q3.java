class Shape{
void area(){
System.out.println("Calculating Area");
}
}

class Square extends Shape{
int side;

Square(int side) {
this.side=side;
}

void area(){
System.out.println("Area is : " + (side*side));
}
}

public class Q3{
public static void main(String[] args){
Square s = new Square(4);
s.area();
}
}