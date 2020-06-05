package hw8;

import java.io.*;

public class Q14 {
    public void print() {
        //in order to compile, order of catch blocks were corrected
        //FileNotFoundException is a subclass of IOexception
        try {
            throw new FileNotFoundException();
        } catch (FileNotFoundException exception) {
            System.out.print("Z");
        } catch (IOException enfe) {
            System.out.print("X");
        } finally {
            System.out.print("Y");
        }
    }

    public static void main(String... ink) {
        new Q14().print(); // ZY is printed
    }
}
