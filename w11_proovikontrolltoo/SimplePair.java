public class SimplePair<K, V> implements MyPair<K, V> {

    private K key;
    private V value;

    // T - Type
    // E - Element
    // K - key
    // V - value
    // S, U, V

    public SimplePair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return this.key;
    }

    @Override
    public V getValue() {
        return this.value;
    }
    
}
