package Chapter10_Polymorphism.Exercise7_8;

import java.util.Random;

public class RandomInstrument {
    Random rand = new Random(47);

    public Instrument randomInst(){
        switch(rand.nextInt(6)){
            default:
            case 0: return new Brass();
            case 1: return new Keyboard();
            case 2: return new Percussion();
            case 3: return new Wind();
            case 4: return new Woodwind();
            case 5: return new Stringed();
        }
    }

}
