import java.util.HashSet;
public class hashset{
    public static void main(String args[]){
        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(90);
        set.add(30);
        set.add(20);
    

        System.out.println(set);
        System.out.println(set.contains(20));
        System.out.println(set.size());

        set.remove(20);
        System.out.println(set);

        System.out.println(set.isEmpty());

        for(int x : set){
            System.out.println(x);
        }
    }

}