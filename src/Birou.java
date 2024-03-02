
public class Birou {
	public final Sertar S1;
	public final Sertar S2;
	public int l, L, H;

	public Birou (Sertar S1, Sertar S2) {
		this.S1 = S1;
		this.S2 = S2;
		if(S1.l > S2.l)
			this.l = S1.l;
		else
			this.l = S2.l;
		
		if(S1.L > S2.L)
			this.L = S1.L; 
		else
			this.L = S2.L;
		this.H = S1.H+S2.H;
	}
	public void tipareste() {
		System.out.println("Primul sertar" );
		this.S1.tipareste();
		System.out.println("Al doilea sertar");
		this.S2.tipareste();
		System.out.println("Dimensiunile tabloului: " + this.l +" latime, " + this.L + " lungime si " + this.H + " inaltime");
	}
}
