
public class Main {
 
    public static void main(String[] args) {
        
        Worker engineer = new Worker("adnan",4000);
        Yonetici yonetici = new Yonetici("murat",5000,10);
        yonetici.showInfos();
        engineer.showInfos();


    }
}
