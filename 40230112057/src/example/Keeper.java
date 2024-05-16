package example;

public class Keeper extends Player  implements Success{

    private int chance=70;
    @Override
    public boolean isSuccessful() {
        return random.getrand()<=chance;
    }
    public Keeper(String name,String number){
        super.name=name;
        super.number=number;
    }
}
