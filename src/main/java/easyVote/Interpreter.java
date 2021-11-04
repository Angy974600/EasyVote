package easyVote;

public class Interpreter {

	public static void main(String[] args) {
		
		Elettore e = new Elettore(101,"federico", "lombardia", "celoria");
		Elettore e2 = new Elettore(102,"angelo", "lombardia", "celoria");
		System.out.println(e.getRegione());
		System.out.println(e2.getResidenza());

	}

}