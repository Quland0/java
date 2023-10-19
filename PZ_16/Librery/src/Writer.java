class Writer extends Library {
    private int yearOfBirth;
    private boolean isDead;
    private String yearOfDeath;

    public Writer(String title, String address, int year, String name, boolean online, int yearOfBirth, boolean isDead, String yearOfDeath){
        super(title, address, year, name, online);
        this.yearOfBirth = yearOfBirth;
        this.isDead = isDead;
        this.yearOfDeath = yearOfDeath;
    }


    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

    public String getYearOfDeath() {
        return yearOfDeath;
    }

    public void setYearOfDeath(String yearOfDeath) {
        this.yearOfDeath = yearOfDeath;
    }

    @Override
    public void display() {

    }
}
