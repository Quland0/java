class Insect extends  Animal{
    private int wingCount;
    private boolean likeJesus;
    public Insect() {

    }
    public Insect(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim, int wingCount, boolean likeJesus){
        super(type, name, age, weight, isFly, isWalk = true, isSwim);
        this.wingCount = wingCount;
        this.likeJesus = likeJesus;
    }
    public void ggggg(){
        System.out.println("Ggggg");
    }

    public int getWingCount() {
        return wingCount;
    }

    public void setWingCount(int wingCount) {
        this.wingCount = wingCount;
    }

    public boolean isLikeJesus() {
        return likeJesus;
    }

    public void setLikeJesus(boolean likeJesus) {
        this.likeJesus = likeJesus;
    }


    @Override
    public void display(){
        System.out.println("I am a Insect");
        System.out.println("WingCount: " + getWingCount());
        System.out.println("IsLikeJesus: " + isLikeJesus());
        super.display();
    }
}
