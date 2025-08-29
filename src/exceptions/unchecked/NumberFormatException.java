package exceptions.unchecked;

public class NumberFormatException {
    public void invalidInteger(){
        String str="abc";
        int num=Integer.parseInt(str);
        System.out.println(num);
    }

    public void emptyString(){
        String str="";
        int num=Integer.parseInt(str);
        System.out.println(num);
    }
    public void floatNumber(){
        String str="12.34";
        int num=Integer.parseInt(str);//cannot parse decimal as int
        System.out.println(num);
    }


    public static void main(String[] args) {
NumberFormatException obj=new NumberFormatException();
obj.invalidInteger();
obj.emptyString();
obj.floatNumber();

    }
}
