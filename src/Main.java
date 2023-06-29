import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        BaseAnimal bober = new BaseAnimal("bob", 18, 20, "red",  110, 7);
        System.out.println(bober);

        bober.voice();

        int food=30;
        bober.eat(food);
        System.out.println(bober);
        bober.moveAnimal(2);
        bober.sleep();

        Dogs bobik = new Dogs("bobik", 2, 5, "Black", 100, 6 );
        System.out.println(bobik);
        bobik.voice();
        bobik.moveAnimal(5);

        Cows burenka = new Cows("burenka", 5, 20, "white", 200, 5);
        System.out.println(burenka);
        burenka.moveAnimal(5);

        Pigs hrysha=new Pigs("Hryusha",5,30,"pink", 300, 8);

        ArrayList<BaseAnimal> animals = new ArrayList<BaseAnimal>();
        animals.add(burenka);
        animals.add(bobik);
        animals.add(bober);
        animals.add(hrysha);

        animals.forEach((n) -> n.voice());

        animals.forEach((n) -> n.eat(30));










    }

}

