import java.util.Random;

public class Player {
    private String name;
    private int number;
    protected Random random;

    public Player(String name, int number) {
        this.name = name;
        this.number = number;
        this.random = new Random();
    }
    protected int getRandomNumber(){
        return random.nextInt(101);
    }
}

//---------------------------------------------------------------------

class Keeper extends Player implements Success {
    private boolean Saved;

    public Keeper(String name, int number) {
        super(name, number);
        this.Saved = false;
    }
    public void attemptToSaveGoal() {
        if (getRandomNumber() <= 70 ) {
            Saved = true;
        }
    }
    @Override
    public boolean isSuccessful() {
        return Saved;
    }
}

//---------------------------------------------------------------------

class Seeker extends Player implements Success {
    private boolean foundSnitch;

    public Seeker(String name, int number) {
        super(name, number);
        this.foundSnitch = false;
    }
    public void attemptToFindSnitch() {
        if (getRandomNumber() <= 5 ) {
            foundSnitch = true;
        }
    }
    @Override
    public boolean isSuccessful() {
        return foundSnitch;
    }
}

//---------------------------------------------------------------------

class Chaser extends Player implements Success {
    private boolean Scored;

    public Chaser(String name, int number) {
        super(name, number);
        this.Scored = false;
    }
    public void attemptToScoreGoal() {
        if (getRandomNumber() <= 30 ) {
            Scored = true;
        }
    }
    @Override
    public boolean isSuccessful() {
        return Scored;
    }
}

//---------------------------------------------------------------------

class Beater extends Player implements Success {
    private boolean Stopped;

    public Beater(String name, int number) {
        super(name, number);
        this.Stopped = false;
    }
    public void attemptToStopChaser() {
        if (getRandomNumber() <= 40 ) {
            Stopped = true;
        }
    }
    @Override
    public boolean isSuccessful() {
        return Stopped;
    }
}