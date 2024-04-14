import java.util.Random;
    class Chaser extends Player implements Success {
        public Chaser(String name, int number) {
            super(name, number);
        }
        @Override
        public boolean isSuccessful() {
            Random random = new Random();
            return random.nextInt(100) < 30;
        }
    }


