package InterfaceAssignment3;

public class VDemo {
	public static void main(String[] args) {
	
		Vehicle []vehicles=new Vehicle[3];
		//creating object four for four wheeler class
		Fourwheeler four=new Fourwheeler();
		//store four wheeler object it in array of interface
		vehicles[0]=four;
		//creating object two for Two wheeler class
		TwoWheeler two=new TwoWheeler();
		//store two wheeler object it in array of interface
		vehicles[1]=two;
		//creating object three for Three wheeler class
		ThreeWheeler three=new ThreeWheeler();
		//store three wheeler object it in array of interface
		vehicles[1]=three;
		for(int i=0;i<3;i++) {
			//check three object exist or not
			if(vehicles[i]==three) {
				//call threewheeler class start method
				vehicles[i].start();
			}
		}
	}
}
