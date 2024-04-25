import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNum = random.nextInt(100) + 1;
        System.out.println(randomNum);

        System.out.print("1 - 100 arasinda texmini eded yazin: ");
        while (true) {
            int eded = getNumber();
            if (beraber(eded,randomNum)){
                break;
            } else if (boyuk(eded, randomNum)) {
            } else {
                kicik(eded,randomNum);
            }
        }
    }
    public static int getNumber() {
        Scanner sc = new Scanner(System.in);
        int eded = sc.nextInt();
        return eded;
    }
    public static boolean beraber(int eded, int randomNum){
        if (eded == randomNum) {
            System.out.println("tebrikler dogru texmin etdiniz.");
        return true;
        }
        return false;
    }
    public static boolean boyuk(int eded, int randomNum) {
        if (eded > randomNum) {
            System.out.print("daha kicik reqem daxil edin. ");
            return true;
        }
        return false;
    }
    public static boolean kicik(int eded, int randomNum){
        if (eded < randomNum){
            System.out.print("daha boyuk reqem daxil edin. ");
            return true;
        }
        return false;
    }
}