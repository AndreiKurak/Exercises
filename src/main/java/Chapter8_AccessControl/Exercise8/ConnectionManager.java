package Chapter8_AccessControl.Exercise8;

/**
 * Exercise 8:   (4) Following the form of the example Lunch.java, create a class called
 *                   ConnectionManager that manages a fixed array of Connection objects. The client
 *                   programmer must not be able to explicitly create Connection objects, but can only get them
 *                   via a static method in ConnectionManager. When the ConnectionManager runs out of
 *                   objects, it returns a null reference. Test the classes in main( ).
 */
public class ConnectionManager {

    static Connection[] connections = new Connection[5];

    static class Connection {

        String connectionLine = "connection";

        private Connection(){

        }

        public String toString(){
            return connectionLine;
        }
    }

    public static Connection getConnection(int i){
        if (i>=connections.length)
            return null;
        connections[i] = new Connection();  //
        return connections[i];
    }
}
