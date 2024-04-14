public class Match {
	private Team team1 = new Team();
	private Team team2 = new Team();
	void start() {
		for (int i = 1; i <= 100; i++) {
			team1.play();
			team2.play();
			if (team1.goals >= 150 || team2.goals >= 150) {
				break;
			}
		}
		System.out.println("team1.goals = "+team1.goals+"\nteam2.goals = "+team2.goals);
		if (team1.goals > team2.goals) {
			System.out.println("team1 is winner");
		} else if (team1.goals == team2.goals) {
			System.out.println("Wow Draw xD");
		} else if (team2.goals > team1.goals) {
			System.out.println("team2 is winner");
		}
	}
}
