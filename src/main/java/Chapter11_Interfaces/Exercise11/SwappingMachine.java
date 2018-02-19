package Chapter11_Interfaces.Exercise11;

/**
 * Exercise 11:   (4) Create a class with a method that takes a String argument and produces
 *                    a result that swaps each pair of characters in that argument. Adapt the class so that it works
 *                    with interfaceprocessor.Apply.process( ).
 */
public class SwappingMachine extends StringProcessor{

    public String process(Object input){
        String line = (String)input;
        String newLine = "";
        int j = 0;
        System.out.println(line.substring(6,8));
        for (int i = 0; i<line.length(); i++){
            j = i + 2;
            newLine += line.substring(j, j + 2);
            newLine += line.substring(i, i + 2);
            i = i + 3;
            if (line.length() - i < 4){
                newLine += line.substring(i, line.length());
                break;
            }
        }
        return newLine;
    }
}
