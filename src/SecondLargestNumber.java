
import java.util.*;
import java.util.stream.Collectors;

public class SecondLargestNumber {

    public static void main(String[] args){
        //int arr = new int[10];
        int arr[] = {5,3,6,7,9,80,8,11,123};

//        demo();
        System.out.println(find2largestTreeSet(arr));
//        System.out.println(find2largestHashMap(arr));
//        System.out.println(find2largest(arr));
    }

    private static void demo1() {
        HashSet<Book> set=new HashSet<Book>();
        //Creating Books
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
        //Adding Books to HashSet
        set.add(b1);
        set.add(b2);
        set.add(b3);
        //Traversing HashSet
        Iterator<Book> i = set.iterator();
        while(i.hasNext())
            System.out.println(i.next());
    }

    private static void demo() {
        TreeSet<Integer> s =  new TreeSet<>();
        HashSet<Integer>s1 = new HashSet<>();
        s.add(17);
        s1.add(1);
        s1.add(null);
        s.add(2);
        s1.add(null);
        s.add(1);
        s1.remove(null);
        System.out.println(s);
        Iterator<Integer> i = s.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println(s1);
        System.out.println(s.ceiling(1));

//        for(int num : s){
//            System.out.println(num);
//        }
    }

    static int find2largest(int []arr){
        int max=0,max2=0;

        for(int i=0;i< arr.length;i++){
            if(arr[i]>max){
                max2=max;
                max=arr[i];
            }
            else if (arr[i]!=max && arr[i]>max2) {
                max2=arr[i];
            }
        }
        return max2;
    }

    static int find2largestHashMap(int arr[]){
        Map<String,Integer> map= new HashMap<>();
        for(int num : arr){
            map.put(String.valueOf(num), num);

        }
        Map.Entry<String,Integer> sort = map.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toList())
                .get(1);
        System.out.println(sort);
        return sort.getValue();
    }
    static int find2largestTreeSet(int arr[]) {
        int n1=0,n2=0,n4=0,i=0;
        SortedSet<Integer> set = new TreeSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int n3=set.last();
        System.out.println(n3+ "n3");
        //2nd last element
        for(int n : set){
            i++;
            System.out.print(n+" ");
            if(n3==n){
                break;
            }
            n2=n;
        }
        System.out.println();
        System.out.println(n2);
        int j=i-4;
        i=0;
        //nth element
        for (int n:set){

            n4=n;
            if(i==j){
                break;
            }
            i++;
        }
//        System.out.println(n4);
        return 0;
    }

}

class Book {
    int id;
    String name, author, publisher;
    int quantity;

    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}