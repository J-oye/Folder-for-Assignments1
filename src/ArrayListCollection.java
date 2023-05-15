import javax.swing.*;
import java.util.ArrayList;

public class ArrayListCollection {
    public static void main(String[] args) {
        ArrayList<String>items = new ArrayList<>();

        items.add("john");
        items.add(0,"Segun");

        System.out.println();
                for(int i =0; i < items.size();i++){
            System.out.println(items.get(i));
        }

               // for (String item : items){
                 //   System.out.println(item);
                //}
        items.add("victor");
        items.add("debts");
        System.out.println(items);

        items.remove("debts");
        System.out.println(items);

        items.remove(1);
        System.out.println(items);

        System.out.println(items.size());
        System.out.println(items.contains("Segun"));
    }
}
