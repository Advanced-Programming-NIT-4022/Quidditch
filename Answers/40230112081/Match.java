public class Match {
    private Team team_1;
    private Team team_2;
    private boolean sk1, sk2; // seeker 1, seeker 2
    public Match(){
        team_1 = new Team();
        team_2 = new Team();
    }

    public void scorePreview()
    {
        int point_1 = team_1.getScore();
        int point_2 = team_2.getScore();
        String res;
        if(point_1 == point_2)
        {
            System.out.println("   ~~~~~~~ DRAW ~~~~~~~");
            System.out.println("   Team1          Team2");
            res = "   "+String.valueOf(point_1)+"           "+String.valueOf(point_2)+" ";
            System.out.println(res);
        }
        else if(point_1 > point_2)
        {
            System.out.println("   ~~~~~~~ TEAM1 ~~~~~~~");
            System.out.println("   Team1          Team2");
            res = "   "+String.valueOf(point_1)+"           "+String.valueOf(point_2)+" ";
            System.out.println(res);
        }
        else
        {
            System.out.println("   ~~~~~~~ TEAM2 ~~~~~~~");
            System.out.println("   Team1          Team2");
            res = "   "+String.valueOf(point_1)+"           "+String.valueOf(point_2)+" ";
            System.out.println(res);
        }

    }

    public void start()
    {
        this.sk1 = team_1.instantWin();
        this.sk2 = team_2.instantWin();
        if(!this.sk1 && !this.sk2)
        {
            team_1.play();
            team_2.play();
            scorePreview();
        }
        else
        {
            if(this.sk1)
            {
                System.out.println("Team-1 wins , 150 points");
            }
            else
            {
                System.out.println("Team-2 wins , 150 points");
            }

        }
    }

}
