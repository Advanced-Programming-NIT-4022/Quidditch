public class Team {

    Keeper keeper1= new Keeper("keeper" , 1);
    Beater beater1 = new Beater("beater" , 2);
    Beater beater2 = new Beater("beater" , 3);
    Chaser chaser1 = new Chaser("chaser" , 4);
    Chaser chaser2 = new Chaser("chaser" , 5);
    Chaser chaser3 = new Chaser("chaser" , 6);
Seeker seeker1 = new Seeker("seeker" , 7);

int goals = 0;
private void setGoal(){
goals++;
}

    boolean snitch = false;
        public void play() {
            if (seeker1.isSuccessful()) {
                snitch = true;
            }

            if (keeper1.isSuccessful()) {
                if (beater1.isSuccessful() || beater2.isSuccessful()) {
                    if ((chaser1.isSuccessful() && chaser2.isSuccessful()) ||
                            (chaser2.isSuccessful() && chaser3.isSuccessful()) ||
                            (chaser1.isSuccessful() && chaser3.isSuccessful())) {
                        setGoal();
                    }
                }
            }
        }
    }
