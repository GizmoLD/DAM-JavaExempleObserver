public abstract class Electrodomestic {
    public String nom;
    public int preu;
    public String marca;
    public String eficiencia;
    public Electrodomestic() {}

    public Electrodomestic(Electrodomestic x){
        if (x != null){
            this.nom = x.nom;
            this.preu = x.preu;
            this.marca = x.marca;
            this.eficiencia = x.eficiencia;
        }
    }

    public abstract Electrodomestic clone();

    public boolean equals(Object object2){
        if (!(object2 instanceof Electrodomestic))return false;
        Electrodomestic cast2 = (Electrodomestic) object2;
        return cast2.nom.equals(nom) && cast2.preu == preu && cast2.marca.equals(marca) && cast2.eficiencia.equals(eficiencia);
    }
}
