package Chapter10_Polymorphism.Exercise7_8;

/**
 * Exercise 7:   (2) Add a new type of Instrument to Music3.java and verify that
 *                   polymorphism works for your new type.
 *Exercise 8:   (2) Modify Music3.java so that it randomly creates Instrument objects
 *                  the way Shapes.java does.
 */
public class Music {
    // Doesn’t care about type, so new types
    // added to the system still work right:
    public static void tune(Instrument i) {
        // ...
        i.play(Note.MIDDLE_C);
    }
    public static void tuneAll(Instrument[] e) {
        for(Instrument i : e)
            tune(i);
    }
    public static void main(String[] args) {
        // Upcasting during addition to the array:
       /* Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        }; */
        RandomInstrument randomInstrument = new RandomInstrument();
        Instrument[] orchestra = new Instrument[7];
        for (int i = 0; i<orchestra.length; i++)
            orchestra[i] = randomInstrument.randomInst();
        tuneAll(orchestra);
    }
}
