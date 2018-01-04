package Chapter10_Polymorphism.Exercise7_8;

public class Percussion extends Instrument {

    void play(Note n) { System.out.println("Percussion.play() " + n); }
    String what() { return "Percussion"; }
    void adjust() { System.out.println("Adjusting Percussion"); }
}
