package aslam;

public class Arr {


    double[] arr1 = createArr(10);
    String[] arr2 = {"aslam", "sahana", "aqeel", "anwar"};

    public double[] createArr(int number) {
        double[] values = new double[number];
        for (int i = 0; i < values.length; i++) {
            values[i] = 2.8767 * i;
        }
        return values;
    }

    public void printArray() {
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }

    public void printArray1() {
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }


}