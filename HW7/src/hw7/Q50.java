package hw7;

import java.io.*;

class Machine {
    public boolean turnOn() throws IOException {return true;}
}

public class Q50 extends Machine {
    public boolean turnOn() throws EOFException {return false;}  //subclass of IOException
    public static void main(String[] doesNotCompute) throws Exception {
        Machine m = new Q50();
        System.out.print(m.turnOn());
    }
}
