package example;
import java.util.Objects;
import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter the name of keeper:");
        String name=input.next();
        System.out.println("please enter the number of keeper:");
        String number=input.next();
        Keeper keeper=new Keeper(name,number);
        System.out.println("please enter the name of seeker:");
        name=input.next();
        System.out.println("please enter the number of seeker:");
        number=input.next();
        Seeker seeker=new Seeker(name,number);
        Team team=new Team();
        team.seeker=seeker;
        team.keeper=keeper;
        Match match=new Match(team);
        boolean done=true;
        while(done){
            System.out.println("which one do you want? 1 or 2");
            int n=input.nextInt();
            switch (n){
                case 1:
                    match.Start1();
                    break;
                case 2:
                    match.Start2();
                    break;
            }
            System.out.println("again? ");
            String again=input.next();
            if(Objects.equals(again,"Y") || Objects.equals(again,"y")){
                team.reset();
                match.team2.reset();
            }
            else
                break;
        }

    }
}
