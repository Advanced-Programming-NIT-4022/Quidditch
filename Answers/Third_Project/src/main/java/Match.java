public class Match {
    Team blue = new Team();
    Team red = new Team();
    public void start(){
    for (int i=0; i<100; i++) {
        if (blue.getgoal() > 100)
            break;
        if (red.getgoal() > 100)
            break;
        blue.play();
        red.play();
    }
        int blue_point = blue.getgoal();
        int red_point = red.getgoal();
        String result = " ";
        if (blue_point > red_point)
            result = "The winner is : Blue Team";
        else if (red_point > blue_point) {
            result = "The winner is : Red Team";
        }else {
            result = "No Winner Draw !";
        }

        System.out.println(result);
        System.out.println("Blue team : " + blue_point);
        System.out.println("Red team : " + red_point);
    }
}
