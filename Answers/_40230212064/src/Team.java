public class Team {
//	1 Keeper, 1 Seeker, 3 Chasers, and 2 Beaters
	Keeper keeper1 = new Keeper();
	Seeker seeker1 = new Seeker();
	Chaser chaser1 = new Chaser();
	Chaser chaser2 = new Chaser();
	Chaser chaser3 = new Chaser();
	Beater beater1 = new Beater();
	Beater beater2 = new Beater();
	int goals = 0;
	private void setGoal() {
		goals += 1;
	}
	void play() {
		int[] list = new int[4];
		for (int i = 0; i < 4; i++) {
			list[i] = 0;
		}
		if (keeper1.isSuccessful()) {
			list[0] += 1;
		}
		if (seeker1.isSuccessful()) {
			list[1] += 1;
		}
		if (chaser1.isSuccessful()) {
			list[2] += 1;
		}
		if (chaser2.isSuccessful()) {
			list[2] += 1;
		}
		if (chaser3.isSuccessful()) {
			list[2] += 1;
		}
		if (beater1.isSuccessful()) {
			list[3] += 1;
		}
		if (beater2.isSuccessful()) {
			list[3] += 1;
		}
		if (list[0] == 1 && list[3] >= 1 && list[2] >= 2) {
			setGoal();
		}
		if (list[1] == 1) {
			goals += 150;
		}
	}
}
