public class Mordor extends Factions {
    private String ringHero;
    public Mordor(String faction,int attack,int armour,String economy,String ringHero){
        super(faction,attack,armour,economy);
        this.ringHero=ringHero;
    }

    public void showInfos(){
        super.showInfos();
        System.out.println("Ring Hero = "+this.ringHero);
    }
}


