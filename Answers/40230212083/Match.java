public class Match{
    Team slytherin = new Team();
    Team gryffindor = new Team();
    public void start(){
        for(int i=0;i<100;i++){
            slytherin.play();
            gryffindor.play();
        }
        System.out.println("Gryffindor Score: " + gryffindor.getScore());
        System.out.println("Slytherin Score: " + slytherin.getScore());
        if(slytherin.getScore() > gryffindor.getScore()) {
            System.out.println("Slytherin Won !");
        }else if(slytherin.getScore() < gryffindor.getScore()){
        System.out.println("Gryffindor Won !");
        }else{
            System.out.println("Draw !");
        }
    }
}