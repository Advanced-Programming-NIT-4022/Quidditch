import java.util.Scanner;

public class MyApp {
    public void str() {
        System.out.println("please type start:");
        Scanner input = new Scanner(System.in);
        String n = input.nextLine();
        Match match = new Match();
        match.start(n);

    }
}
