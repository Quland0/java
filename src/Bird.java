class Bird extends Animal{
    private String area;
    private boolean winterFly;
    public Bird() {
        super();

    }
    public Bird(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim, String area, boolean winterFly) {
        super(type, name, age, weight, isFly = true, isWalk, isSwim);
        this.area = area;
        this.winterFly = winterFly;
    }
    public void chiriсk_chiriсk(){
        System.out.println("chiriсk_chiriсk");
    }

    public boolean isWinterFly() {
        return winterFly;
    }

    public void setWinterFly(boolean winterFly) {
        this.winterFly = winterFly;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public void display(){
        System.out.println("I am a Bird");
        System.out.println("Area: " + getArea());
        System.out.println("IsWinterFly: " + isWinterFly());
        super.display();
    }
}
