public class Find{
    public int Find(int a , int b, int c){
        return (a+b+c)/3;
    }
    public static void main(String[] args) {
    Find obj = new Find();
    int avg = obj.Find(10 , 20 , 30);
    System.out.println("average of a b and c is "+ avg );
    }
}