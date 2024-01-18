/* Marcella Touch
 * Bill Newman
 * IT211
 * 01-04-24
 */
public class RocketModule {
    public static void main(String args[]){
        drawRocket();
    }
    public static void drawRocket(){
        drawCone();
        drawSquare();
        drawBanner();
        drawSquare();
        drawCone();
    }
    public static void drawCone(){
        System.out.println("   /\\  ");
        System.out.println("  /  \\ ");
        System.out.println(" /    \\");

    }
    public static void drawSquare(){
        System.out.println("+------+");
        System.out.println("| 	   |");
        System.out.println("| 	   |");
        System.out.println("+------+");

    }
    public static void drawBanner(){
        System.out.println("|United|");
        System.out.println("|States|");

    }
}
