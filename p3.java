class animal{
    void walk(){
        System.out.println("walk");
    }
}
class bird extends animal{
    void fly(){
        System.out.println("fly");
    }
}
public class p3 {
    public static void main(String[] args)
    {
        bird b=new bird();
        b.walk();
        b.fly();
    }
}
Footer
© 2022 GitHub, Inc.
