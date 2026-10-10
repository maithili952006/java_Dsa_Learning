import java.util.ArrayList;

public class array_list{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        for(int i =0; i <list.size();i++){
            System.out.println(list.get(i));
        }
    }
}