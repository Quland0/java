class Worker extends Library{
    private String position;
    private boolean isman;

    public Worker(String title, String address, int year, String name, boolean online, String position, boolean isman){
        super(title, address, year, name, online);
        this.position = position;
        this.isman = isman;
    }


    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean isIsman() {
        return isman;
    }

    public void setIsman(boolean isman) {
        this.isman = isman;
    }

    @Override
    public void display() {

    }
    @Override
    public String toString() {
        return super.toString() + "\nposition: " + position + "\nisman: " + isman;
    }
}
