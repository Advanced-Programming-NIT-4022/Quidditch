package org.quidditch;

public class Match {
    Team[] team = new Team[2];
    int currentRound;
    int numberOfRounds;

    Match() {
        this.numberOfRounds = 150;
        for (int i = 0; i < this.team.length; i++) {
            this.team[i] = new Team();
        }
    }

    Match(int rounds) {
        this.numberOfRounds = rounds;
        for (int i = 0; i < this.team.length; i++) {
            this.team[i] = new Team();
        }
    }

    void start() {
        for (this.currentRound = 0; this.currentRound < this.numberOfRounds; this.currentRound++) {
            for (Team playingTeam : this.team) {
                playingTeam.play();
            }
        }
        printTheResults();
    }

    void printTheResults() {
        boolean snitchCaught=false;
        for(Team team:this.team){
            if(team.seekerPlayWasSuccessful()){
                System.out.println("Team 1 has caught the snitch and wins!");
                snitchCaught=true;
                break;
            }
        }
        if(!snitchCaught) {

            if (this.team[0].getGoals() != this.team[1].getGoals()) {
                System.out.printf("Team %d wins!\n", (this.team[0].getGoals() > this.team[1].getGoals()) ? 1 : 2);
            } else {
                System.out.println("Draw!");
            }
        }
        System.out.printf("Results:\tTeam 1: %d\t Team 2: %d", this.team[0].getGoals(), this.team[1].getGoals());
    }

}
