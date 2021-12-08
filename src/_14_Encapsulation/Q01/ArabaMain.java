package _14_Encapsulation.Q01;

public class ArabaMain {

	public static void main(String[] args) {

		Araba merso = new Araba("Mercedes","Gri",10,2017);
		Araba bmw = new Araba("BMW","Mavi",200,2020);
		Araba honda = new Araba();
		
		honda.setMotor(1300);
		honda.setYil(2019);
		honda.setModel("Honda");
		
		System.out.println("Sectiginiz arac " + merso.getModel()+" "+merso.getMotor()+" beygir ve rengi " + merso.getRenk() + " Yılı " + merso.getYil());

	}

}
