/* Marcella Touch
 * Bill Newman
 * IT211
 * 01-09-24
 */
import java.lang.Math;
public class TemperatureConverter {
    public static void main(String[] args){
        double[] arr = {100, 0, 47, 58, 70};
        looper(arr, "f");
        System.out.println();
        looper(arr, "c");

    }
    public static String toString(double original, double newNum, String convertTo){
        if(convertTo == "f"){
            return original+" degrees C is "+newNum+" degrees F";
        }else{
            return original+" degrees F is "+newNum+" degrees C";
        }

    }
    public static void looper(double[] tempArr, String convertTo){
        for(int i=0; i<5; i++){
            System.out.println(toString(tempArr[i], temperatureConverter(tempArr[i], convertTo), convertTo));
        }

    }
    public static double temperatureConverter(double temp, String convertTo){
        if(convertTo.toLowerCase() == "c"){ // F to C
            double x = 5 * (temp - 32) / 9;
            return Math.round(x*Math.pow(10,2))/Math.pow(10,2);


        }else if(convertTo.toLowerCase() == "f"){ // C to F
            double y = (temp * 1.8)+32;
            return Math.round(y*Math.pow(10,2))/Math.pow(10,2);

        }else{
            System.out.println("error");
            return 0;

        }

    }
    public static float temperatureConverter(float temp, String convertTo){
        if(convertTo.toLowerCase() == "c"){ // F to C
            float x = 5 * (temp - 32) / 9;
            return (Math.round(x*100)/100);

        }else if(convertTo.toLowerCase() == "f"){ // C to F
            float y = (float) (temp * 1.8)+32;
            return Math.round(y*100)/100;

        }else{
            System.out.println("error");
            return 0;

        }
    }
}
