package ua.lviv.lgs.task2;


public class Main {

    public static void main( String[] args) {

        myMap<Integer, String> passportsAndNames = new myMap<>(111111,"name");

        passportsAndNames.add ( 111222,"Brad Pitt" );
        passportsAndNames.add ( 212133, "Keira Knightley" );
        passportsAndNames.add ( 162348, "Angelina Jolie" );
        passportsAndNames.add ( 808277, "Johnny Depp" );
        passportsAndNames.add ( 212212, "Al Pacino" );
        passportsAndNames.add ( 133133, "Russell Crowe" );
        passportsAndNames.setOfKeys ();
        passportsAndNames.listOfValues ();
        passportsAndNames.viewMap ();

        passportsAndNames.removeKey ( 212212 );
        passportsAndNames.removeValue ( "Russell Crowe" );
        passportsAndNames.setOfKeys ();
        passportsAndNames.listOfValues ();
        passportsAndNames.viewMap ();
    }
}
