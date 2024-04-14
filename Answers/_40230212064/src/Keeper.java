public class Keeper extends Player implements Success {
	@Override
	public boolean isSuccessful() {
		if (chane() <= 70) {
			return true;
		} else {
			return false;
		}
	}
}
