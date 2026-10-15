import java.util.*;
class LRUCache {
int capacity;
LinkedHashMap<Integer,Integer> map;
    public LRUCache(int capacity) {
        this.capacity=capacity;
        map = new LinkedHashMap<>();
    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        int value = map.remove(key);
        map.put(key,value);
        return value;
    }
    
    public void put(int key, int value) {
        map.remove(key);
        map.put(key,value);
        if(map.size()>capacity){
            int firstkey = map.keySet().iterator().next();
           map.remove(firstkey);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */