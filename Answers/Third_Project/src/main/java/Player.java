import java.util.Random;

public class Player {
    private String name;
    private int number;

    public Player(String name, int number) {
        this.name = name;
        this.number = number;
    }
    /*public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }*/
}




class Keeper extends Player implements Success {
    private int goalsSaved;
    private Random random;

    public Keeper(String name, int number) {
        super(name, number);
        this.goalsSaved = 0;
        this.random = new Random();
    }

    public void attemptToSaveGoal() {
        if (random.nextDouble() <= 0.7) {
            saveGoal();
        }
    }

    private void saveGoal() {
        goalsSaved++;
    }

    public int getGoalsSaved() {
        return goalsSaved;
    }

    @Override
    public boolean isSuccessful() {
        return goalsSaved > 0;
    }
}





class Seeker extends Player implements Success {
    private boolean foundSnitch;
    private Random random;

    public Seeker(String name, int number) {
        super(name, number);
        this.foundSnitch = false;
        this.random = new Random();
    }

    public void attemptToFindSnitch() {
        if (random.nextDouble() <= 0.05) {
            foundSnitch = true;
        }
    }

    public boolean hasFoundSnitch() {
        return foundSnitch;
    }

    @Override
    public boolean isSuccessful() {
        return foundSnitch;
    }
}




class Chaser extends Player implements Success {
    private int goalsScored;
    private Random random;

    public Chaser(String name, int number) {
        super(name, number);
        this.goalsScored = 0;
        this.random = new Random();
    }

    public void attemptToScoreGoal() {
        if (random.nextDouble() <= 0.3) {
            scoreGoal();
        }
    }

    private void scoreGoal() {
        goalsScored++;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    @Override
    public boolean isSuccessful() {
        return goalsScored > 0;
    }
}





class Beater extends Player implements Success {
    private int chasersStopped;
    private Random random;

    public Beater(String name, int number) {
        super(name, number);
        this.chasersStopped = 0;
        this.random = new Random();
    }

    public void attemptToStopChaser() {
        if (random.nextDouble() <= 0.4) {
            stopChaser();
        }
    }

    private void stopChaser() {
        chasersStopped++;
    }

    public int getChasersStopped() {
        return chasersStopped;
    }

    @Override
    public boolean isSuccessful() {
        return chasersStopped > 0;
    }
}



