package problemSolving;


import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @Author: Rutul Darji
 * @Description : LRU cache implementation with LinkedHashSet
 * */
public class LRU_cache {

    int capacity;
    Set<Integer> set;

    public LRU_cache(int capacity) {
        this.capacity = capacity;
        this.set = new LinkedHashSet<>(capacity);
    }

    void refer(int key) {
        if(get(key) == false) {
            put(key);
        }
    }

    private void put(int key) {
        if (set.contains(key)) {
            set.remove(key);
        } else if (capacity == set.size()) {
           Integer firstKey = set.iterator().next();
           set.remove(firstKey);
        }
        set.add(key);
    }

    private boolean get(int key) {
        if (!set.contains(key)){
            return false;
        }
        set.remove(key);
        set.add(key);
        return true;
    }

    public void display()
    {
        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LRU_cache cache = new LRU_cache(4);
        cache.refer(1);
        cache.display();
        cache.refer(2);
        cache.display();
        cache.refer(3);
        cache.display();
        cache.refer(1);
        cache.display();
        cache.refer(4);
        cache.display();
        cache.refer(5);
        cache.display();
    }
}
