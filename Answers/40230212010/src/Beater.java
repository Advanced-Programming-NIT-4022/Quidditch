public class Beater extends Player{

    Beater(String name, int number) {
        super(name, number);
        //TODO Auto-generated constructor stub
    }
    
    @Override
    public boolean isSuccessful() {
        return Math.random() < 0.4;
    }
}
