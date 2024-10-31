import java.util.Scanner;
public class LinearEquationLogic{
    private int x1 = 0;
    private int x2 = 0;
    private int y1 = 0;
    private int y2 = 0;
    private String firstcoord = "";
    private String secondcoord = "";

    public void start(){

    }
    private void getData() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first coordinate" );
        int x1 = scan.nextInt();
        System.out.println("Enter your second coordinate!!!");
        int x2 = scan.nextInt();
        System.out.println("Enter your first coordinate of the second set");
        int y1 = scan.nextInt();
        System.out.println("second coordinate");
        int y2 = scan.nextInt();
    }
    private void parseData() {

    }
}
