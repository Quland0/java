public class Main {
    public static void main(String[] args) {
/*        Animal tiger = new Animal();
        tiger.type = "тигр";
        tiger.name = "Артём";
        tiger.age = 15;
        tiger.weight = 300.6;
        tiger.isSwim = true;
        tiger.isWalk = true;
        tiger.isFly = false;
        tiger.displayInfo();
        tiger.rename("Антон");
        tiger.displayInfo();

        Animal sparrow = new Animal();
        sparrow.type = "воробей";
        sparrow.name = "Капитан";
        sparrow.age = 3;
        sparrow.weight = 2;
        sparrow.isSwim = false;
        sparrow.isWalk = true;
        sparrow.isFly = true;
        sparrow.displayInfo();
        sparrow.holiday(2);
        sparrow.displayInfo();

    }*/
       /* Animal tiger = new Animal("тигр", "Артем");
        tiger.age = 15;
        tiger.weight = 300.6;
        tiger.isSwim = true;
        tiger.isWalk = true;
        tiger.isFly = false;
        tiger.displayInfo();

        Animal sparrow = new Animal("воробей", 5);
        sparrow.weight = 3.6;
        sparrow.isSwim = true;
        sparrow.isWalk = true;
        sparrow.isFly = false;
        sparrow.displayInfo();

        Animal duck = new Animal("утка", "Утя", 3, 5.8, true, true, true);
        duck.holiday(5);
        duck.rename("Утя");
        duck.displayInfo();
    }*/
       /* Animal tiger = new Animal("тигр", "Артем", 15, 300.6, false, true, true);
        tiger.setAge(15);
        tiger.setWeight(300.6);
        tiger.setSwim(true);
        tiger.setWalk(true);
        tiger.setFly(false);
        tiger.displayInfo();

        Animal duck = new Animal("Утка", "Утя", 3, 5.8, true, true, true);
        duck.holiday(5);
        duck.rename("утя-утя");
        duck.displayInfo();
        System.out.println(duck.getAge());
        System.out.println(duck.getName());
        System.out.println(duck.getWeight());
        System.out.println(duck.getType());
        System.out.println(duck.getSwim());
        System.out.println(duck.getWalk());
        System.out.println(duck.getFly());*/


        /*Animal duck = new Animal("утка", "Утя", 3, 5.8, true, true, true);
        duck.displayInfo();

        duck.holiday();
        duck.displayInfo();

        duck.holiday(5);
        duck.displayInfo();

        duck.holiday(0.4);
        duck.displayInfo();

        duck.holiday(0.3, 2);
        duck.displayInfo();*/

        Animal duck = new Animal("утка", "Утя", 3, 5.8, true, true, true);
        duck.display();

        Bird b = new Bird();
        b.setName("Bob");
        b.display();
        b.setArea("На югах");
        b.setWinterFly(false);
        System.out.println(b.getArea());
        System.out.println(b.isWinterFly());
        b.chiriсk_chiriсk();

        Fish f = new Fish();
        f.setName("Сельд");
        f.display();
        f.setSquama("Крупная");
        f.setUpStreamSwim(true);
        System.out.println(f.getSquama());
        System.out.println(f.isUpStreamSwim());
        f.bul_bul();

        Insect i = new Insect();
        i.setName("жук");
        i.display();
        i.setWingCount(4);
        i.setLikeJesus(true);
        System.out.println(i.getWingCount());
        System.out.println(i.isLikeJesus());
        i.ggggg();




    }
}