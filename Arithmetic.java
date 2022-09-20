class arithmetic{
int add(int x,int y){
return x+y;
}
}
class adder extends arithmetic{
double add(double x,double y){
return x+y;
}
}
class jj{
public static void main(String[] args){
adder s=new adder();
System.out.println(s.add(10,20));
System.out.println(s.add(10.20,20.00));
}
}
