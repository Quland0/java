class Animal{
    String type;
    String name;
    int age;
    double weight;
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

    У класса Animal должны быть следующие конструкторы:
            - позволяющий создать животное с его типом и именем;
- позволяющий создать животное с его типом и возрастом. При этом в имени окажется значение "No Name";
- позволяющий создать животное со всеми его свойствами в том же порядке, который указан на предыдущем слайде;
    Можете проверить свой класс, запустив его с этим кодом:


}
*/

public void displayInfo(){
    System.out.printf("Type: %s \nName: %s\n Age: %d \n Weight: %s \n isFly: %s \n isWalk: %s \n isSwim %s \n\n ", type, name, age, weight, isFly, isWalk, isSwim);
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
Animal(String t, String n, int a, double w, boolean f, boolean wal, boolean sw){
    type = t;
    name = n;
    age = a;
    weight = w;
    isFly = f;
    isWalk = wal;
    isSwim = sw;
}
public void rename(String rename){
    name = rename;
    }

public void holiday(int count) {
    double plusweight = 0.1;
    weight += plusweight * count;
}
}
