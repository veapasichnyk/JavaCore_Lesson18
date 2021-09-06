package ua.lviv.lgs.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main ( String [] args ) {

        List <Integer> listInteger = new ArrayList <Integer> (  );

        AddToList.addToList ( listInteger );

        System.out.println ( listInteger );

        //Як результат в List<Integer> були додані об’єкти типу String
        //це можливо в Java через так зване Erasure - стирання типів
        //перевірка типів Generics відбувається у момент компіляції програми
        //під час її виконання типи Generics стираються і у нашому випадку залишається List
        //в який ми можемо додати об'єкти різних типів.
    }
}
