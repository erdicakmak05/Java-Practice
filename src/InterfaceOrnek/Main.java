package InterfaceOrnek;

public class Main {

	public static void main(String[] args) {
		
		PcMuhendisi m1 = new PcMuhendisi(false, false);
		
		m1.askerlikDurumu();
		m1.adliSicilDurumu();
		System.out.println(m1.mezuniyetOrtalamasi(3.4));
		String tecrube[] = {"Aselsan","Turkcell","Opet"};
		m1.isTecrubesi(tecrube);

	}

}
