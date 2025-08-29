package exceptions.unchecked;

public class ArithmeticException {
    public  void divisionByZero(){
        int a=5;
        int b=0;
        int c=a/b;
        System.out.println(c);
    }
    public void modulusByZero(){
        int i=9;
        int j=0;
        int x=i%j;
        System.out.println(x);
    }
    public void doubleDivideByZero(){
        double a=9.0;
        double b=0.0;
        double c=a/b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        ArithmeticException obj=new ArithmeticException();
        obj.divisionByZero();
        obj.modulusByZero();
        obj.doubleDivideByZero();
    }
}
