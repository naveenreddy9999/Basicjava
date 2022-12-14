package Basics;

public class basicOne {

    public static void main(String[] args) {
        Hello();
        basicOne basicOne = new basicOne();
        basicOne.sp();
        basicOne.mm();

        System.out.println(basicOne.mm());
        methodOverLoading.over();
        System.out.println(methodOverLoading.naveen);

    }


    public static void Hello(){
        System.out.println("Hello World");
    }

    public void sp(){
        System.out.println("sp");
    }

    public int mm(){

        int a=10;
        return a;
    }
}
