public class Seeker extends Player implements Success {
	@Override
	public boolean isSuccessful() {
		if (chane() <= 5) {
			return true;
		} else {
			return false;
		}
	}
}
