package easyVote;

public class Scrutatore extends Utente{

	private final int idElezione;

	public Scrutatore(int id, String name, int idElezione) {
		super(id, name);
		this.idElezione = idElezione;
	}

	public int getIdElezione() {
		return idElezione;
	}
}