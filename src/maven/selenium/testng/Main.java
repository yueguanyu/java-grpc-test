package maven.selenium.testng;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ImJa imJa = new ImJa();
        imJa.imJ();
        Date now = new Date();
        System.out.println(now);
        System.out.printf("this is package: maven.selenium.testng, %d \n", 10);
    }
}