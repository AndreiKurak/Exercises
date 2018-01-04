package Chapter10_Polymorphism.Exercise7_8;

public class Woodwind extends Wind{

    void play(Note n) { System.out.println("Brass.play() " + n); }
    void adjust() { System.out.println("Adjusting Brass"); }
}
