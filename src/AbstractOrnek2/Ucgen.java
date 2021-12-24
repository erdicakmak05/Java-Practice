package AbstractOrnek2;

public class Ucgen extends Sekil {

	private int a;
	private int b;
	private int c;

	public Ucgen(String isim,int a, int b, int c) {
		super(isim);
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public void alanHesapla() {
		double u = (a+b+c)/2.0;
		double alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
		System.out.println(getIsim()+ " in alanı :" + alan +" dir." );
	}

	@Override
	public void cevreHesapla() {
		int cevre = a+b+c;
		System.out.println(getIsim()+ " nin çevresi :" + cevre + " dir.");

	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public int getC() {
		return c;
	}

	public void setA(int a) {
		this.a = a;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void setC(int c) {
		this.c = c;
	}

}
