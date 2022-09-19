import java.util.Scanner;
class rec {
    double  length ,width;
    public void set(double l , double w) {
        length = l;
        width = w;
    }
    double area(){
        return length*width;
    }
    double perimeter(){
        return (2*(length+width));
    }
}
class p1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int w = sc.nextInt();
        if (l < 0) {
            System.out.println("rectangle is not formed");
        } else if (w < 0) {
            System.out.println("rectangle not formed");
        } else {
            rec rec1 = new rec();
            rec1.set(l, w);
            System.out.println("area=" + rec1.area());
            System.out.println("perimeter" + rec1.perimeter());
        }
    }
    }
