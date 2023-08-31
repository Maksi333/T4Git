import java.util.ArrayList;

public class APP {
    static ArrayList<Simon> simons = new ArrayList<>();
    public static void main(String[] args) {
        String hello = ("Hello world");
        System.out.println(hello);


        Simon simon1 = new Simon("Simon,", 1,"Andersen", "Datamatiker");
        Simon simon2 = new Simon("Simon2", 2, "Anderson", "Finansøkonom");
        simons.add(simon1);
        simons.add(simon2);
    }
}
