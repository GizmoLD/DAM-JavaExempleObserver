public class Nevera extends Electrodomestic{
    public int frigories;
    public int soroll;

    public Nevera(){
    }

    public Nevera(Nevera target){
        super(target);
        if (target != null){
            this.frigories = target.frigories;
            this.soroll = target.soroll;
        }
    }

    @Override
    public Nevera clone (){
        return new Nevera(this);
    }

    @Override
    public boolean equals(Object obj2){
        if (!(obj2 instanceof Electrodomestic) || !super.equals(obj2)) return false;
        Nevera cast2 = (Nevera) obj2;
        return cast2.frigories == frigories && cast2.soroll == soroll;
    }
}
