package electric;

public class Chansey{

    private String color = "unknown";
    private String name = "Chansey";
    private int age = 1;
    private double weight = 1.0;


    //getter and setter for color

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    //getter and setter for Name

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    //getter and setter for Age

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    //getter and setter for weight

    public double getWeight(){
        return weight;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    //2 unique behaviours
    public void abilityOne(){
        System.out.println("Chansey shares Nutritious Eggs with the Injured!");
    }

    public void abilityTwo(){
        System.out.println("Chansey is generally gentle and brings happiness!");
    }

}
