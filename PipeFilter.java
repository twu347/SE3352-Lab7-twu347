/*************************************
    Name: Tong Wu
    Student ID: 251155168
    Date: Dec 1, 2022
    Professor: Dr. Shaimaa Ali
 *************************************/

import java.util.Arrays;

public class PipeFilter {
    public static void main(String[] args) {

        // original array
        double[] filter1 = {4.5, 12.7, 11, 18.9, 7.90, 5.32};

        // filter 1: eliminate the top number (the maximum)
        for (int i = 0; i < filter1.length; i++) {
            for (int j = i + 1; j < filter1.length; j++) {
                double temp = 0;
                if (filter1[i] > filter1[j]) {
                    temp = filter1[i];
                    filter1[i] = filter1[j];
                    filter1[j] = temp;
                }
            }
        }

        //filter 2: eliminate the bottom number (the minimum)
        double[] filter2 = Arrays.copyOf(filter1, filter1.length - 1);
        for (int i = 0; i < filter2.length; i++) {
            for (int j = 0; j < filter2.length - 1; j++) {
                double temp = 0;
                if (filter2[j] < filter2[j+1]) {
                    temp = filter2[j];
                    filter2[j] = filter2[j+1];
                    filter2[j+1] = temp;
                }
            }
        }

        // filter 3: transform the degrees to Fahrenheit
        double[] filter3 = Arrays.copyOf(filter2, filter2.length-1);
        for (int i = 0; i < filter3.length; i++){
            filter3[i] = (filter3[i] * 9 / 5) + 32;
        }

        // filter 4: output final values one by one
        double[] filter4 = Arrays.copyOf(filter3, filter3.length);
        for (int i = 0; i < filter4.length; i++){
            System.out.println(filter4[i]);
        }
    }
}
