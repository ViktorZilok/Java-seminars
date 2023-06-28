import java.util.HashMap;
import java.util.Iterator;


public class Seminar6 {

    public static void main(String[] args) {
        Set<Integer> set1 = new Set();
        set1.add(555);
        set1.add(5);
        Iterator<Integer> it = set1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());            
        };                     

    }
}


class Set<E> {
    private HashMap<E, Object> set = new HashMap<>();
    
    private static final Object VALL = new Object(); 

    public boolean add(E tel) {
        return set.put(tel, VALL) == null;  

    }   
   

    public boolean remove(E tel){
        return set.remove(tel) == VALL;
    }

    public int size(){
        return set.size();
    }

    public boolean isEmpy(){
        return set.isEmpty();
    }
    

    public Iterator<E> iterator(){        
      return set.keySet().iterator();
    }
    
}


