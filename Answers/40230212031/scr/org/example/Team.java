import java.util.ArrayList;
import java.util.List;
public class Team {
    private List<Player> players;
    private int goals;

    public Team(List<Player> players) {
        this.players = players;
        this.goals = 0;
    }
    public void setGoal() {
        goals++;
    }
    public int getGoals() {
        return goals;
    }

    public void play () {
            Keeper keeper = null;
            List<Beater> beaters = new ArrayList<>();
            List<Chaser> chasers = new ArrayList<>();
            for (int i = 0; i < players.size(); i++) {
                Player player = players.get(i);
                if (player instanceof Keeper) {
                    keeper = (Keeper) player;
                } else if (player instanceof Beater) {
                    beaters.add((Beater) player);
                } else if (player instanceof Chaser) {
                    chasers.add((Chaser) player);
                }
            }
            boolean keeperSuccess;
            if (keeper != null && keeper.isSuccessful()) {
                keeperSuccess = true;
            } else {
                keeperSuccess = false;
            }

            boolean atLeastOneBeaterSuccess = false;
            for (int i = 0; i < beaters.size(); i++) {
                Beater beater = beaters.get(i);
                if (beater.isSuccessful()) {
                    atLeastOneBeaterSuccess = true;
                    break;
                }
            }

            boolean atLeastTwoChasersSuccess = false;
            int successfulChasers = 0;
            for (int i = 0; i < chasers.size(); i++) {
                Chaser chaser = chasers.get(i);
                if (chaser.isSuccessful()) {
                    successfulChasers++;
                }
            }
            if (successfulChasers >= 2) {
                atLeastTwoChasersSuccess = true;
            }

            if (keeperSuccess && atLeastOneBeaterSuccess && atLeastTwoChasersSuccess) {
                setGoal();
            }
    }
}


