import java.util.Objects;

public class Match {

    public void start(String n) {
        if(Objects.equals(n, "start")){
            Team team = new Team();
            team.Play();
        }



    }
}
