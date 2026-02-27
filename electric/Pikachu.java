package electric;


public class Pikachu{

	private String color = "Yellow";
	private String name = "Pikachu";

	public void printColor(){
		System.out.println(color);
	}

	public String getColor(){
		return color;
	}

	public void setColor(String color){
		this.color = color;
	}

	public void run(){
		System.out.println("Pikachu is running!!!!!");
	}
	
}