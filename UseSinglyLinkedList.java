package mentoring083118;

//import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class UseSinglyLinkedList {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("EARTH");
        list.add("MARS");
        list.add("SUN");
        list.add(2, "MOON");
        ((LinkedList<String>) list).addFirst("SATURN");
        ((LinkedList<String>) list).remove(4);
        ((LinkedList<String>) list).addLast("PLUTO");
        list.add(0,"PLUTO");

        Iterator call = list.iterator();
        while(call.hasNext()){
            System.out.println(call.next());

        }
    }

}
