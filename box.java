import java.util.Scanner;

public class box {
    public int length;
    public int b;
    public int h;

    public void input(){
        Scanner sc=new Scanner(System.in);
        length=sc.nextInt();
        b=sc.nextInt();
        h=sc.nextInt();

    }
    public void displayarea(){
        System.out.println(length*b);
    }

    public void displayvol(){
        System.out.println(length*b*h);
    }



}

class boxmain{
    public static void main(String[] args) {
        box obj=new box();
        obj.input();
        obj.displayarea();
        obj.displayvol();

    }
}
