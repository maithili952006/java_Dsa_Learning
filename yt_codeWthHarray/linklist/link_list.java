import java.util.*;

public class link_list{
    public static void main(String args[]){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        for(int i =0; i <list.size();i++){
            System.out.println(list.get(i));
        }
    }
}