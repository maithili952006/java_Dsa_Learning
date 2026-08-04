import java.util.ArrayList;
import java.util.Collections; 


class methods_Array_List{
    public static void main(String args[]) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        // ArrayList<String> list1 = new ArrayList<>();
        // ArrayList<Boolean> list3 = new ArrayList<>();

        // add elements
        list.add(2);
        list.add(3);
        list.add(4); 

        System.out.println(list);

        //get elements
        int element = list.get(0);
        System.out.println(element);

        //add elements between
        list.add(1,1);
        System.out.println(list);

        //set element
        list.set(0,5);
        System.out.println(list);

        //delete elements
        list.remove(3);
        System.out.println(list);

        //size
        int size = list.size();
        System.out.println(size);

        //loops
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        System.out.println();

        //sorting
        Collections.sort(list);
        System.out.println(list);

    }
}