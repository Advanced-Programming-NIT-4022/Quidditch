import java.util.Random;

class Seeker extends Player{
        public Seeker(String name , int number){
            super(name , number);
        }
        @Override
        public boolean isSuccessful(){
            return new Random().nextInt(100) < 5;
        }
}
