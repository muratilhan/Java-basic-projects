public class Laptop {
    
    private Anakart anakart1;
    private Screen screen1;
    
    public Laptop(Anakart anakart1,Screen screen1){
        this.anakart1=anakart1;
        this.screen1=screen1;
    }
    public Anakart getAnakart(){
        return this.anakart1;
    }
    public Screen getScreen(){
        return this.screen1;
    }
    public void pcAc(){

        System.out.println("pc açılıyor");
}



}
