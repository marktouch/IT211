/* Marcella Touch
 * Bill Newman
 * IT211
 * 01-03-24
 */
public class ParkingSign {
    public static void main(String args[] ){
        System.out.print(sign("2:00", "6:00")); // calls the sign function passing in two String variables
    }
    public static String sign(String start, String end){
        return "NO PARKING\n" + " \n" +start+ " - " +end+ " a.m.";
    }
}
