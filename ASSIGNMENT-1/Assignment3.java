import java.util.Scanner;

/*Write a java program for temperature conversion? */
public class Assignment3 {

    public static void main(String[] args) {
        float celsius = 90;
        double temp_in_kelvin = 0;
        double temp_in_fahrenheit = 0;
        temp_in_kelvin = celsius + 273.15;
        temp_in_fahrenheit = celsius * (9 / 5) + 32;

        System.out.println("Temperature in kelvin=" + temp_in_kelvin);
        System.out.println("Temperature in Fahrenheit=" + temp_in_fahrenheit);

    }

}
