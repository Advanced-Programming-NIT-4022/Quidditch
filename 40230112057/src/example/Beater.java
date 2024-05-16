package example;

public class Beater extends Player implements Success{

    private int chance=40;
    @Override
    public boolean isSuccessful() {
        return random.getrand()<=chance;
    }
}
