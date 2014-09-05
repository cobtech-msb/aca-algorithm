import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        Iterator iList;
        
        list.add("포도");
        list.add("딸기");
        list.add("수박");
        
        iList = list.iterator();
        
        System.out.println("---추가---");
        
        while (iList.hasNext()) {
            System.out.println(iList.next());
        }
        
        list.remove("딸기");
        
        iList = list.iterator();
        
        System.out.println("---일부삭제---");
        
        while (iList.hasNext()) {
            System.out.println(iList.next());
        }
    }
}