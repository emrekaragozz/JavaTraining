package hw3;// yoyo is changed to hw3

// Class name must be same with the file name, TestGame is changed to Q42.
public class Q42 {
    public String runTest(boolean spinner, boolean roller) {
        if(spinner = roller) // not the "==" operator
            return "up"; //because roller is true
        else
            return roller ? "down" : "middle"; // not executed
    }
    public static final void main(String pieces[]) {
        final Q42 tester = new Q42();
        System.out.println(tester.runTest(false,true)); //prints up
    }
}
