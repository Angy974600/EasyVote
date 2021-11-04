package easyVote;

public class Elettore extends Utente{

    private final String regione;
    private final String residenza;
    
    public Elettore(final int id, final String name, final String regione, final String residenza) {
        super(id, name);
        this.regione = regione;
        this.residenza = residenza;
    }

    public String getRegione() {
        return regione;
    }

    public String getResidenza() {
        return residenza;
    }
}