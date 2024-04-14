import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=1;
        while(a==1){
        Match match = new Match();
        match.Start();
        System.out.println("Do you want to continue?\n1.Yes 2.No");
        a = scanner.nextInt();
        if(a!=1)break;
    }
        scanner.close();
    }
   
}
