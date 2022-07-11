
public class SelectFaction {
    
    public Factions SelectArmy(String faction){
        if (faction.equals("Elves")){
            return new Elves("Elves",400,200,"bad","Galadriel");
        }
        else if (faction.equals("Mordor")){
            return new Mordor("Mordor",250,150,"good","Sauron");
        }
        else{
            return null;
        }
    }

}
