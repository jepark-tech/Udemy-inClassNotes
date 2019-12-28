package Section8;

public class Main {

	public static void main(String[] args) {
		Car porsche = new Car();
		Car holden = new Car();
		porsche.setModel("Carrera");
		porsche.setModel("911");
		
		System.out.println("Model of porsche car: " + porsche.getModel());
	}

}
