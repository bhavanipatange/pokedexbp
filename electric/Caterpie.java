package electric;

public class Caterpie{

	private String color = "light blue";
	private String name = "Caterpie";
	private int age = 8;
	private double weight = 3.5;


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
		this.name =name;

	}

	//getter and setter for Age

	public int getAge(){

		return age;
	}

	public void setAge(int age){
		this.age =age;
	}

	//getter and setter for weight

	public double getWeight(){

		return weight;
	}

	public void setWeight(double weight){
		this.weight =weight;
	}

	//2 unique behaviours
	public void stench(){
        System.out.println("Caterpie releases a Terrible Stench !");
    	}

    	public void climb(){
        System.out.println("Caterpie uses suction pads to climb!");
    	}

	

}


