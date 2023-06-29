public class Dogs extends  BaseAnimal {
    private String sound; // звук

    public Dogs(String name, int age, int weight, String colour, int appetite, int satiety) {
        super(name, age, weight, colour, appetite, satiety);


    }

    @Override

    public void moveAnimal(int quantaty) {
        System.out.println(" Собака встала на задние лапы   " + quantaty + " раз ");
    }
    @Override
    public void voice(){
        System.out.println( "Гав-Гав");
    }
}
