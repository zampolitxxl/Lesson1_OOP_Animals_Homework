import java.util.Objects;

public class BaseAnimal {
    private String name; // поле, содержащее имя животного
    private int age; // возраст животного
    private int weight; // вес

    private String colour; // цвет


    private int appetite; // аппетит  (столько он съедает за раз)
    private int satiety; // сытость (голодный или нет)
    private String movement; // движение




//конструктор


    public BaseAnimal (String name, int age, int weight, String colour, int appetite, int satiety) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.colour = colour;
        this.appetite=appetite;
        this.satiety=satiety;
        this.movement="Движение по Умолчанию";





    }
    //методы

    // 1. Подача голоса
    public void voice() {

        System.out.println("Звук животного по Умолчанию");
    }

    //2. Питаться

    public void eat(int food) {
        if (satiety > 9||food<0) {
            return;
        }

        int satietyIncrease = food * 10 / appetite;
        System.out.println(name  + " поел " + food + " едениц еды. "+ " Сытость увеличилась на  " + satietyIncrease + " условных едениц ");

        satiety = satiety + satietyIncrease;
        if (satiety > 10) {
            satiety = 10;
        }
        System.out.println("новый уровень сытости "+ name + "  " + satiety + " условных  едениц ");

        //satiety=satiety+(eaten/appetite);
    }

    //3. Двигаться
    public void moveAnimal(int quantaty) {
        System.out.println( movement + " произведено " + quantaty + " раз ");
    }

    //3. Спать
    public void sleep() {
        System.out.println(name+" заснул ");
    }


    //4. toString переделка

    @Override
    public String toString() {
        return name + " Age [" + age + "]" + " Weight kg  [" + weight + "]"+ " Colour  [" + colour + "]"+  " Apetite  [" + appetite + "]"+ " Satiety  [" + satiety+" из 10" + "]";
    }




}
