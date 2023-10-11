public class Rentadora extends Electrodomestic{
    public int revolucions;
    public int soroll;

    public Rentadora() {
    };

    public Rentadora (Rentadora r){
        super(r);
        if (r != null){
            this.revolucions = r.revolucions;
            this.soroll = r.soroll;
        }
    }

    @Override
    public Rentadora clone() {
        return new Rentadora(this);
    }

    @Override
    public boolean equals(Object objecte2){
        if (!(objecte2 instanceof Rentadora) || !super.equals(objecte2)) return false;
        Rentadora ren = (Rentadora) objecte2;
        return ren.revolucions == revolucions && ren.soroll == soroll;
    }
}
