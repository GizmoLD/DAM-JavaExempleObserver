public class Forn extends Electrodomestic{
    public int temperatura;
    public boolean autoneteja;

    public Forn(){
    }

    public Forn(Forn target){
        super(target);
        if (target != null){
            this.temperatura = target.temperatura;
            this.autoneteja = target.autoneteja;
        }
    }

    @Override
    public Forn clone (){
        return new Forn(this);
    }

    @Override
    public boolean equals(Object obj2){
        if (!(obj2 instanceof Electrodomestic) || !super.equals(obj2)) return false;
        Forn cast2 = (Forn) obj2;
        return cast2.autoneteja == autoneteja && cast2.temperatura == temperatura;
    }
}
