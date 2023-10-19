class Client extends Library{
    private String cname;
    private String csurname;
    private boolean isdebts;

    public Client(String title, String address, int year, String name, boolean online, String cname, String csurname, boolean isdebts){
        super(title, address, year, name, online);
        this.cname = cname;
        this.csurname = csurname;
        this.isdebts = isdebts;
    }


    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCsurname() {
        return csurname;
    }

    public void setCsurname(String csurname) {
        this.csurname = csurname;
    }

    public boolean isIsdebts() {
        return isdebts;
    }

    public void setIsdebts(boolean isdebts) {
        this.isdebts = isdebts;
    }

    @Override
    public void display() {

    }
}
