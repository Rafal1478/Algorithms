package limplists;

public interface IList<T> {
     boolean isEmpty();
     int size();
     void add(T value);
     void add(T value, int index);
     T get(int index);
     void set(T value, int index);
     void remove(int index);
     void swap(int index1, int index2);



}
