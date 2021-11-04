package easyVote;

public abstract class Utente {
    
    private final int id;
    private final String name;

    public Utente(int id, String name){
        this.id = id;
        this.name = name;
    }
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
}