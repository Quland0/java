class Fish extends Animal{
    private String squama;
    private boolean upStreamSwim;

    public Fish(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim, String squama, boolean upStreamSwim) {
        super(type, name, age, weight, isFly, isWalk, isSwim = true);
        this.squama = squama;
        this.upStreamSwim = upStreamSwim;
    }

    public Fish() {

    }

    public void bul_bul(){
        System.out.println("bul-bul");
    }

    public String getSquama() {
        return squama;
    }

    public void setSquama(String squama) {
        this.squama = squama;
    }

    public boolean isUpStreamSwim() {
        return upStreamSwim;
    }

    public void setUpStreamSwim(boolean upStreamSwim) {
        this.upStreamSwim = upStreamSwim;
    }


    @Override
    public void display(){
        System.out.println("I am a Fish");
        System.out.println("Squana: " + getSquama());
        System.out.println("IsUpStreamSwim: " + isUpStreamSwim());
        super.display();
    }
}
