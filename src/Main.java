
public class Main {
public static void main(String[] args) {
	Sertar S1 =new Sertar(60, 40, 20);
	Sertar S2 = new Sertar (50, 30 , 20);
	Birou birou = new Birou(S1, S2);
	birou.tipareste();
}
}
