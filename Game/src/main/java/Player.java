class Player implements Success{
    protected String name;
    protected int num;
    public Player(String name , int number){
        this.name = name;
        this.num = number;
    }

    @Override
    public boolean isSuccessful() {
        return false;
    }
}
