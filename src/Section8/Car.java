package Section8;

public class Car {
	
	//private - Readable only in this class
	//protected = REadable in same package
	private int doors;
	private int wheels;
	private String model;
	private String engine;
	private String colour;
	
	public void setModel(String model) {
		String validModel = model.toLowerCase();
		if(validModel.equals("carrera") || validModel.equals("commodore")) {
			this.model = model;
		} else {
			this.model = "Unknown";
		}
	}
	
	public String getModel() {
		return this.model;
	}
	
}
