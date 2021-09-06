package ua.lviv.lgs.task2;

import java.util.Objects;

public class MyEntry< K, V > {
    K key;
    V value;

    public MyEntry ( ) {
        super();
        this.key = key;
        this.value = value;
    }

    public MyEntry ( K key , V value ) {
    }

    public K getKey ( ) {
        return key;
    }

    public V getValue ( ) {
        return value;
    }

    @Override
    public boolean equals ( Object o ) {
        if ( this == o ) return true;
        if ( o == null || getClass ( ) != o.getClass ( ) ) return false;
        MyEntry <?, ?> myEntry = (MyEntry <?, ?>) o;
        return Objects.equals ( key , myEntry.key ) && Objects.equals ( value , myEntry.value );
    }

    @Override
    public int hashCode ( ) {
        return Objects.hash ( key , value );
    }

    @Override
    public String toString ( ) {
        return "MyEntry{" +
               "key=" + key +
               ", value=" + value +
               '}';
    }
}
