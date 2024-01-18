/* Marcella Touch
 * Bill Newman
 * IT211
 * 01-09-24
 */
public class GetEven {
    public static void main(String[] args){
        System.out.println(getEven(80));
        System.out.println(getEven(3));
        System.out.println(getEven(7));
        System.out.println(getEven(4));
    }
    public static boolean getEven(float num){
        if(num % 2 == 0){
            System.out.println("The number is "+ num + " and is even.");
            return true;
        }else{
            System.out.println("The number is "+ num + " and is odd.");
            return false;
        }
    }
}
