package maven.selenium.testng;

import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        new ImJa().imJ();
        int[] numbers = { 1, 2, 4, 3, 5 };
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.printf("this is package: maven.selenium.testng, %d \n", 10);
    }
}