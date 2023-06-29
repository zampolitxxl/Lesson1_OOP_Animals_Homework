public class Pigs extends  BaseAnimal{
    public Pigs(String name, int age, int weight, String colour, int appetite, int satiety) {
        super(name, age, weight, colour, appetite, satiety);
    }
    @Override
    public void voice(){
        System.out.println( " Хрю-хрю");
    }


    @Override

    public void moveAnimal(int quantaty) {
        System.out.println(" свинья   легла и встала  " + quantaty + " раз ");
    }
}
