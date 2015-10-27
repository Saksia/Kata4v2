package kata4v3;
import java.util.*;

public class Histogram <T> {

    private final Map <T,Integer> histogram = new HashMap <>();
    
    public Integer get(Object key) {
        return histogram.get(key);
    }

    public Set<T> keySet() {
        return histogram.keySet();
    }

    public void increment (String key) {
        histogram.put((T) key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
    }
    
}