package electric;

public class Jynx{

    private String color = "unknown";
    private String name = "Jynx";
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
        System.out.println("Jynx dances on rhythmic!");
    }

    public void abilityTwo(){
        System.out.println("Jynx speciliased in communication like human!");
    }

}
