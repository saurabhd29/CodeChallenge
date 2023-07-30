import java.util.*;

public class CollectionDemo {

    public static void main(String[] args) throws NullPointerException{
        List<Integer> s = new ArrayList<>();
        s.add(100);
        s.add(null);
        s.add(100);
        s.add(null);
        s.add(90);
        System.out.println(s.get(0));
        System.out.println(s.indexOf(100));
//        System.out.println(h.removeAll(s));
        Iterator i = s.iterator();
//        while (i.hasNext())
//            System.out.println(i.next());
        /*for (int n : s){
            System.out.println(n);
        }*/
    }

    private static int n1(int num){
        if(num==1){
            return 1;
        }
        return 0;
    }


}
