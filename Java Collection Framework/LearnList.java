import java.util.*;
public class LearnList{
    public static void main(String[] args){

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(1,20);
        list.remove(Integer.valueOf(20));
        list.get(0);
        System.out.println(list);

        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Grapes");

        Iterator<String> fe = fruits.iterator();
        while(fe.hasNext()){
            System.out.println("Iterator " + fe.next());
        }
    }
}