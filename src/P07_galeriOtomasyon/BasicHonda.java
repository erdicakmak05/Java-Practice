package P07_galeriOtomasyon;

public class BasicHonda extends Araba implements DisAraba,IcAraba {
	
	private String marka= "Sıradan Honda";
	private String model= "Civic";
	int yil = 2010;
	private String renk = "Gri";


	public BasicHonda(String marka, String model, int yil, String renk) {
		super();
		this.marka = marka;
		this.model = model;
		this.yil = yil;
		this.renk = renk;
	}

	public String getMarka() {
		return marka;
	}

	public String getModel() {
		return model;
	}

	public int getYil() {
		return yil;
	}

	public String getRenk() {
		return renk;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setYil(int yil) {
		this.yil = yil;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	@Override
	public void move() {
		System.out.println(getMarka()+ " " + getModel() +" Araba haraket ediyor.");
		
	}

	@Override
	public void direksiyon() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void koltuk() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void klima() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void kapi() {
		// TODO Auto-generated method stub
		
	}

}
