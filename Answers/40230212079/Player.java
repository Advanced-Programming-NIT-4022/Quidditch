import java.util.* ;
class Player implements Success  {
    public String isSuccessful(double z) {
        if(((double) Math.random()) > z){
            return "t" ;
        }
        else {
            return "f" ;
        }
    }
}
