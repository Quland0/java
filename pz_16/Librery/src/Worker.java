public class Worker{
    private String position;
    private boolean isMan;
    private String name;

    public Worker(String position, boolean isman, String name) {
        this.position = position;
        this.isMan = isman;
        this.name = name;
    }


    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIsman() {
        return isMan;
    }

    public void setIsman(boolean isman) {
        this.isMan = isman;
    }
}
