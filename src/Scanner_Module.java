import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Scanner_Module {
    public static void scanner_Method(int size){
        Scanner scanner = new Scanner(System.in);
        List<Integer> number = new ArrayList<>(size);
        for(int i=1;i<=size;i++){
            number.add(scanner.nextInt());
        }
        System.out.println("List of Numbers :: "+number);
    }
    public static void main(String[] args) {
        scanner_Method(5);
    }
}
