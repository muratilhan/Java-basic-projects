public class Test {
    public static void main(String[] args) {
        Anakart anakart1 = new Anakart("blabla","w10",2);
        Resulation res1 = new Resulation(1920, 1080);
        Screen screen1 = new Screen("monster",1080,res1);
        
        Laptop pc1 = new Laptop(anakart1,screen1);
    }
    
}
