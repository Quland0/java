class LibraryCard extends Library{
    private int num;


    public LibraryCard(String title, String address, int year, String name, boolean online, int num){
        super(title, address, year, name, online);
        this.num = num;
    }
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public void display() {

    }
}
