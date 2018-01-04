package Chapter10_Polymorphism.Exercise7_8;

public class Keyboard extends Instrument {

    void play(Note n) { System.out.println("Keyboard.play() " + n); }
    String what() { return "Keyboard"; }
    void adjust() { System.out.println("Adjusting Keyboard"); }
}
