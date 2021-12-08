package _14_Encapsulation.Q01;

public class Araba {
	
	private String model;
	private String renk;
	private int motor;
	private int yil;
	
	//Araba obj = new Araba();
	Araba(){
		
	}
	
	public String getModel() {
		return model;
	}

	public String getRenk() {
		return renk;
	}

	public int getMotor() {
		return motor;
	}

	public int getYil() {
		return yil;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public void setMotor(int motor) {
		if(motor>100) {
			this.motor=motor;
		}else {
			System.out.println("100'ün altında beygir gücü olamaz.Hata");
		}
	}

	public void setYil(int yil) {
		if (yil<0) {
			System.out.println("Negatif yil giremezsiniz");
			this.yil=-1*yil;
		}else {
			this.yil=yil;
		}
	}

	Araba(String model,String renk, int motor, int yil) {
		this.model=model;
		this.renk=renk;
		//this.motor=motor;
		//this.yil=yil;
		setYil(yil);
		setMotor(motor);
	}
}
