//package INNOVATION-LAB.INNOVATION-LAB.DAILY_TASK.DAY_4;

interface Playable{
    void play();
}
class Guitar implements Playable{
    public void play(){
        System.out.println("SONG FROM GUITAR");
    }
}

class Piano implements Playable{
    public void play(){
        System.out.println("SONG FROM PIANO");
    }
}


public class Interface{
    public static void main (String [] args ){
        Guitar guitar = new Guitar();
        Piano piano = new Piano();
        guitar.play();
        piano.play();
    }
}


