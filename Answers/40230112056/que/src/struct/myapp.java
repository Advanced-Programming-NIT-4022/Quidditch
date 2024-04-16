package struct;

public class myapp {
    public static void main (String[] jsdbfkjsdf){
        match p = new match();
        p.start();
        if (p.g1<p.g2){ 
            System.out.format("team 2 wins with %d score ; team 1 score = %d",p.g2,p.g1);
        }
        else if (p.g1>p.g2) {
            System.out.format("team 1 wins with %d score ; team 2 score = %d",p.g1,p.g2);
        }
        else {
            System.out.println("draw 50 _ 50 ");
        }
    }
}
