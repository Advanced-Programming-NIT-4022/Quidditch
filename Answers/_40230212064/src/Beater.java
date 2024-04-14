public class Beater extends Player implements Success {
	@Override
	public boolean isSuccessful() {
		if (chane() <= 40) {
			return true;
		} else {
			return false;
		}
	}
}
