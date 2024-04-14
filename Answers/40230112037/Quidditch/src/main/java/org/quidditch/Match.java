package org.quidditch;

public class Match {
    Team[] team = new Team[2];
    int currentRound;
    int numberOfRounds;

    Match(String team1Name, String[] team1PlayerNames, String team2Name, String[] team2PlayerNames) {
        this.numberOfRounds = 150;
        team[0] = new Team(team1Name, team1PlayerNames);
        team[1] = new Team(team2Name, team2PlayerNames);
    }

    Match(int rounds, String team1Name, String[] team1PlayerNames, String team2Name, String[] team2PlayerNames) {
        this.numberOfRounds = rounds;
        team[0] = new Team(team1Name, team1PlayerNames);
        team[1] = new Team(team2Name, team2PlayerNames);
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
        boolean snitchCaught = false;
        for (Team team : this.team) {
            if (team.seekerPlayWasSuccessful()) {
                System.out.printf("%s from %s has caught the snitch and wins!", team.seeker.name, team.name);
                snitchCaught = true;
                break;
            }
        }
        if (!snitchCaught) {

            if (this.team[0].getGoals() != this.team[1].getGoals()) {
                System.out.printf("Team %s wins!\n", (this.team[0].getGoals() > this.team[1].getGoals()) ? this.team[0].name : this.team[1].name);
            } else {
                System.out.println("Draw!");
            }
        }
        System.out.printf("Results:\t%s: %d\t %s: %d", this.team[0].name, this.team[0].getGoals(), this.team[1].name, this.team[1].getGoals());
    }

}
