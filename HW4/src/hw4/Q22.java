package hw4;

public class Q22 {
    public static void main(String[] names) {
        String [] example = {"Advent","Java"};
        addStationName(example);
    }

    public static void addStationName(String[] names) {
        // names[names.length] = "Times Square"; //ArrayIndexOutOfBoundsException
        names[(names.length)-1] = "Times Square"; // the last element of array
        System.out.println(names[names.length-1]);
    }
}

