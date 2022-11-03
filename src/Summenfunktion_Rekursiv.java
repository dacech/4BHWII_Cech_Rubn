import java.util.Scanner;

public class Summenfunktion_Rekursiv{

    static int calcSum(int x){
        if(x>1) {
            return x + calcSum(x - 1);
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Summenfunktion:");
        System.out.println("===============");
        System.out.print("Zahl: ");
        int x = reader.nextInt();

        System.out.printf("Ergebnis: %d", calcSum(x));
    }
}