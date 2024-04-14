public class Chaser extends Player implements Success {
	@Override
	public boolean isSuccessful() {
		if (chane() <= 30) {
			return true;
		} else {
			return false;
		}
	}
}
