class Animal {
    String type;
    String name;
    int age;
    static double weight;
    boolean isFly;
    boolean isWalk;
    boolean isSwim;
/*    public void displayInfo(){
        System.out.printf("Type: %s \nName: %s\n Age: %d \n Weight: %s \n isFly: %s \n isWalk: %s \n isSwim %s \n\n ", type, name, age, weight, isFly, isWalk, isSwim);
    }
    public void rename(String rename){
        name = rename;
    }
    public void holiday(int count){
        double plusweight = 0.1;
        weight += plusweight*count;
    }


}
*/
    public Animal(){

    }
    Animal(String t, String n){
       type = t;
       name = n;
   }
   Animal(String t, int a){
       type = t;
       age = a;
       name = "No name";
   }
   Animal(String type, String name, int age, boolean isFly, boolean isWalk, boolean isSwim){
       this.type = type;
       this.name = name;
       this.age = age;
       this.isFly = isFly;
       this.isWalk = isWalk;
       this.isSwim = isSwim;
   }
    public void display() {
        System.out.printf("Type: %s \nName: %s\n Age: %d \n Weight: %s \n isFly: %s \n isWalk: %s \n isSwim %s \n\n ", type, name, age, weight, isFly, isWalk, isSwim);
    }


    public void rename(String rename) {
        name = rename;
    }

    public void holiday() {
        this.weight = weight + 0.1;
    }

    public void holiday(double m){
        this.weight = weight + m;
    }
    public void holiday(double m, int n){

        this.weight = (weight + m) * n;
    }

    public Animal(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim) {
        setType(type);
        setName(name);
        setAge(age);
        setWeight(weight);
        setFly(isFly);
        setWalk(isWalk);
        setSwim(isSwim);
    }
    public String getType(){
        return this.type;
    }
    public void setType(String type){
        this.type = type;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public double getWeight(){
        return this.weight;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }

    public boolean getFly(){
        return this.isFly;
    }
    public void setFly(boolean isFly){
        this.isFly = isFly;
    }
    public boolean getWalk(){
        return this.isWalk;
    }
    public void setWalk(boolean isWalk){
        this.isWalk = isWalk;
    }
    public boolean getSwim(){
        return this.isSwim;
    }
    public void setSwim(boolean isSwim){
        this.isSwim = isSwim;
    }

}





