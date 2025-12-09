public class StorlekPaSallskap {
    
    private final Utskriftstjanst loggen;

    public StorlekPaSallskap(Utskriftstjanst utskriftstjanst) {
        this.loggen = utskriftstjanst;
    }

    public int hanteraStorlek(int sallskapStorlek) {
        if (sallskapStorlek >= 1 && sallskapStorlek <= 12) {
            loggen.loggaMeddelande("Sällskapsstorlek godkänd: " + sallskapStorlek);
            return sallskapStorlek;
        } else {
            String felMeddelande = "Ogiltig storlek. Måste vara 1-12, var: " + sallskapStorlek;
            throw new IllegalArgumentException(felMeddelande);
        }
    }
}

/*gamla koden

public class StorlekPaSallskap {

    public boolean giltigStorlek(int sallskapStorlek) {

        return sallskapStorlek >= 1 && sallskapStorlek <= 12;

    }
}*/