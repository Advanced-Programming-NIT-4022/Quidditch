public class Chaser extends Player implements Success{
    private int chance=30;

    @Override
    public boolean isSuccessful() {
        return random.getrand()<=chance;
    }

}
