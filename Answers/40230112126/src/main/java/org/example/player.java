package org.example;
import java.util.Random;

    public class player{

    }

    interface success {
        public boolean isSuccessful();
    }
    class keeper extends player implements success{

        @Override
        public boolean isSuccessful() {
            Random rand = new Random();
            int random = rand.nextInt(0,100);
            if(random>30)
                return true;
            else
                return false;
        }
    }
    class seeker extends player implements success{

        @Override
        public boolean isSuccessful(){
            Random rand = new Random();
            int random = rand.nextInt(0,100);
            if(random>95)
                return true;
            else
                return false;
        }
    }
    class chaser extends player implements success{

        @Override
        public boolean isSuccessful() {
            Random rand = new Random();
            int random = rand.nextInt(0,100);
            if(random>70)
                return true;
            else
                return false;
        }
    }
    class beater extends player implements success{
        @Override
        public boolean isSuccessful() {
            Random rand = new Random();
            int random = rand.nextInt(0,100);
            if(random>60)
                return true;
            else
                return false;
        }
    }

    class team{
        seeker seekerObj = new seeker();
        keeper keeperObj = new keeper();
        beater beater1Obj = new beater();
        beater beater2Obj = new beater();
        chaser chaser1Obj = new chaser();
        chaser chaser2Obj = new chaser();
        chaser chaser3Obj = new chaser();
        int goal=0;
        boolean snitch = false;
        private void setGoal(){
            goal ++;
        }



        public void play(){
            if (seekerObj.isSuccessful())
                snitch = true;

            if((beater1Obj.isSuccessful() || beater2Obj.isSuccessful()) && keeperObj.isSuccessful() &&
                    ((chaser1Obj.isSuccessful()|| chaser2Obj.isSuccessful()) && chaser3Obj.isSuccessful())){
                setGoal();
            }
        }
    }
    class match{
        public void start(){
            team gryffindor = new team();
            team slytherin = new team();

            gryffindor.play();
            slytherin.play();

            if (gryffindor.snitch){
                System.out.println("Harry Potter got the snitch!!!");
                System.out.println("-------------------------------");
                gryffindor.goal += 150;
            }

            if (slytherin.snitch){
                System.out.println("Draco Malfoy got the snitch!!!");
                System.out.println("-------------------------------");
                slytherin.goal += 150;
            }

            for(int i=1; i<=100; i++){
                gryffindor.play();
                slytherin.play();
            }
            if(gryffindor.goal > slytherin.goal)
                System.out.println("gryffindor has won the match!!!");

            if (gryffindor.goal < slytherin.goal)
                System.out.println("slytherin has won the match!!!");

            if (gryffindor.goal == slytherin.goal)
                System.out.println("draw!!!");

            System.out.println("-------------------------------");

            System.out.println("gryffindor has scored " + gryffindor.goal +" goals!!!");
            System.out.println("slytherin has scored " + slytherin.goal + " goals!!!");

            System.out.println("-------------------------------");


        }

}
