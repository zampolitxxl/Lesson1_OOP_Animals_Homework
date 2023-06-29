public class Cows extends BaseAnimal {
    public Cows(String name, int age, int weight, String colour, int appetite, int satiety) {
        super(name, age, weight, colour, appetite, satiety);
    }

    @Override
    public void voice(){
        System.out.println( " Му-му");
    }


    @Override

    public void moveAnimal(int quantaty) {
        System.out.println(" корова  прошла " + quantaty + " шагов ");
    }
}
