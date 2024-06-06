import java.util.List;

class Generic<T> {
    T t;

    void set(T t) {
        this.t = t;
    }

    T get() {
        return this.t;
    }

    void process(List<? extends Number> list) {
        System.out.println(list.iterator());
    }
}

class GenericTwo<K, V extends Number> {
    private K key;
    private V value;

    public GenericTwo(K key, V value) {
        this.key = key;
        this.value = value;
    }

    void get() {
        System.out.println(key+":"+value);
    }
}

class NewGeneric<X> {
    <T> NewGeneric(T arg){
        System.out.println(arg);
    }
}