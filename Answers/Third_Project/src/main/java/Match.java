public class Match {
    Team blue = new Team();
    Team red = new Team();
    public void start(){
        for (int i=0; i<100; i++){
            blue.play();
            red.play();
        }
        int blue_point = blue.getgoal();
        int red_point = red.getgoal();
        System.out.println(blue_point);
        System.out.println(red_point);

    }
}
