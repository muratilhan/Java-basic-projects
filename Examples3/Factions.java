public class Factions {
    
    private String faction;
    private int attack;
    private int armour;
    private String economy;
    
    public Factions(String faction,int attack,int armour,String economy){
        this.faction=faction;
        this.attack=attack;
        this.armour=armour;
        this.economy=economy;
    }
    
    public void showInfos(){
        System.out.println("Faction = "+this.faction);
        System.out.println("Attack = "+this.attack);
        System.out.println("Armour = "+this.armour);
        System.out.println("Economy = "+this.economy);
    }








}
