package ua.lviv.lgs.task2;

import java.util.*;
import java.util.Map.Entry;

public class myMap<K, V> extends MyEntry <K, V> {
    private HashMap <K, V> map;

    public myMap ( K key , V value ) {
        super ( key , value );
        this.map = new HashMap <K, V> ( );
    }

    public void add ( K key , V value ) {
        map.put ( key , value );
    }

    public void removeKey ( K key ) {
        Iterator iterator = map.entrySet ( ).iterator ( );
        while ( iterator.hasNext ( ) ) {
            Entry next = (Entry) iterator.next ( );
            if ( next.getKey ( ).equals ( key ) ) {
                iterator.remove ( );
                System.out.println ( next.getKey ( ) + " was removed" );
            }
        }
        System.out.println ( );
    }

    public void removeValue ( V value ) {
        Iterator iterator = map.entrySet ( ).iterator ( );
        while ( iterator.hasNext ( ) ) {
            Entry next = (Entry) iterator.next ( );
            if ( next.getValue ( ).equals ( value ) ) {
                iterator.remove ( );
                System.out.println ( next.getValue ( ) + " was removed" );
            }
        }
        System.out.println ( );
    }

    public void setOfKeys ( ) {
        Set      setOfKeys = new HashSet ( );
        Iterator iterator  = map.entrySet ( ).iterator ( );
        while ( iterator.hasNext ( ) ) {
            Entry next = (Entry) iterator.next ( );
            setOfKeys.add ( next.getKey ( ) );
        }
        System.out.println ( "Set of keys: " + setOfKeys );

        System.out.println ( );
    }

    public void listOfValues ( ) {
        List     listOfValues = new ArrayList ( );
        Iterator iterator     = map.entrySet ( ).iterator ( );
        while ( iterator.hasNext ( ) ) {
            Entry next = (Entry) iterator.next ( );
            listOfValues.add ( next.getValue ( ) );
        }
        System.out.println ( "List of values: " + listOfValues );

        System.out.println ( );
    }

    public void viewMap ( ) {
        Iterator iterator = map.entrySet ( ).iterator ( );
        while ( iterator.hasNext ( ) ) {
            Entry next = (Entry) iterator.next ( );
            System.out.println ( "Key is: " + next.getKey ( ) + " Value is: " + next.getValue ( ) );
        }
        System.out.println ( );
    }


}