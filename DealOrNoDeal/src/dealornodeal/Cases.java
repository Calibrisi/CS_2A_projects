package dealornodeal;

import java.util.ArrayList;
import java.util.Arrays;

public class Cases {

    private int[] cases;

    public Cases() {
        cases = new int[27];
        cases[0] = 0;
        cases[1] = 1;
        cases[2] = 2;
        cases[3] = 5;
        cases[4] = 10;
        cases[5] = 25;
        cases[6] = 50;
        cases[7] = 75;
        cases[8] = 100;
        cases[9] = 200;
        cases[10] = 300;
        cases[11] = 400;
        cases[12] = 500;
        cases[13] = 750;
        cases[14] = 1000;
        cases[15] = 5000;
        cases[16] = 10000;
        cases[17] = 25000;
        cases[18] = 50000;
        cases[19] = 75000;
        cases[20] = 100000;
        cases[21] = 200000;
        cases[22] = 300000;
        cases[23] = 400000;
        cases[24] = 500000;
        cases[25] = 750000;
        cases[26] = 1000000;
    }

    public int numcasesLeft() {
        int count = 0;
        for (int i = 1; i < cases.length; i++) {
            if (cases[i] != 0) {
                count++;
            }
        }
        return count;
    }

    public String[] casesLeftAsStrings() {
        int left = numcasesLeft();
        String[] toRet = new String[left];
        int toRetLast = 0;
        for (int i = 1; i < cases.length; i++) {
            if (cases[i] != 0) {
                toRet[toRetLast] = i + "";
                toRetLast++;
            }
        }
        return toRet;
    }

    public ArrayList<String> casesLeftAsList() {
        ArrayList<String> toRet = new ArrayList<String>();
        for (int i = 1; i < cases.length; i++) {
            if (cases[i] != 0) {
                toRet.add(i + "");
            }
        }
        return toRet;
    }

    public String valuesLeft() {
        String toRet = "";
        for (int i = 1; i < cases.length; i++) {
            if (cases[i] != 0) {
                toRet += cases[i] + " ";
            }
        }
        return toRet;
    }

    public String toString() {
        String blah = "";
        for (int i = 0; i < cases.length; i++) {
            blah += cases[i] + " ";
        }
        return blah;
    }

    public void swap(int a, int b) {
        int temp = cases[a];
        cases[a] = cases[b];
        cases[b] = temp;
    }

    public int location(int number) {
        int[] location = casesLeftAsInts();
        return location[number];
    }

    public int valueOfCase(int location) {
        return cases[location];
    }

    public void findAndClearValue(int value) {
        for (int i = 1; i < cases.length; i++) {
            if (cases[i] == value) {
                cases[i] = 0;
                break;
            }
        }
    }

    public void shuffle() {
        for (int i = 1; i < cases.length; i++) {
            int newlocation = (int) (Math.random() * (cases.length - 1)) + 1;
            swap(i, newlocation);
        }

    }

    public void clearLocation(int location) {
        cases[location] = 0;
    }

    public int sumOfValues() {
        int sum = 0;
        for (int i = 0; i < cases.length; i++) {
            sum += cases[i];
        }
        return sum;
    }

    public double average() {
        double avg = sumOfValues() / this.numcasesLeft();
        return avg;
    }

    public int[] casesLeftAsInts() {
        int left = numcasesLeft();
        int[] toRet = new int[left];
        int toRetLast = 0;
        for (int i = 1; i < cases.length; i++) {
            if (cases[i] != 0) {
                toRet[toRetLast] = i;
                toRetLast++;
            }
        }
        return toRet;
    }

    public int middleVal() {
        int[] values = casesLeftAsInts();
        int mid = values.length / 2;

        return values[mid];
    }

    public double offer() {
        return (middleVal() + average()) / 2;
    }

}