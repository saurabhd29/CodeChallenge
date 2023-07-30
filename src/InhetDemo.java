import java.io.Serializable;

public class InhetDemo {

    public static void main(String args[]){
//        B a = new A();
//        a.C();
//        A a = new B();
//        a.C();
        m1(null);
    }

    static void m1(Object o){ System.out.println("O");}

    static void m1(String s){ System.out.println("S");}
}


class A {
    public void A(){
        System.out.println("A");
    }
    public void C(){
        System.out.println("A");
    }
}
 class B extends A{
    public void B(){

        System.out.println("B");
    }
     public void C(){
         System.out.println("B");
     }
}
