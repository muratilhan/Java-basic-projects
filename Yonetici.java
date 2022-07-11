    public class Yonetici extends Worker{
     private int sorumluSayisi;
    
        public Yonetici(String name,int salary,int sorumluSayisi){
            super(name,salary);
            this.sorumluSayisi=sorumluSayisi;
        }
    
        public void showInfos(){
            super.showInfos();
            System.out.println("responsiblePersons = "+sorumluSayisi);
        }

    }
    
    
    
    


