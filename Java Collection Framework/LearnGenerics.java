public class LearnGenerics{
    public static void main(String args[]){
        Dog<String> d1 = new Dog<>("abc123");
        Dog<String> d2 = new Dog<>("def123");
        Dog<String> d3 = new Dog<>("ghi123");

        // Calling the Generic Method

        printData("Hello");
        printData(143);

    }

    // generic method

    static <P> void printData(P data){
        System.out.println(data);
}

}

class Dog<E>{

    E id;

    public Dog(E id){
        this.id = id;
        System.out.println(id);
    }

}

