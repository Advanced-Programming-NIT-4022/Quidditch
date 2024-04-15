import java.util.Scanner;

public class myApp {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your team Name: ");
    team team1 = new team(input.nextLine());
    System.out.println("Enter the Name of the opponent team: ");
    team team2 = new team(input.nextLine());
    match match = new match(team1, team2);

    match.start();
  }

}
