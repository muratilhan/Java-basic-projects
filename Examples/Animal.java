public class Animal {
    private String name;
    private int legs;

    public Animal(String name,int legs){
        this.name=name;
        this.legs=legs;
    }

    public String getName(){
        return this.name;
    }
    public void run(){
        System.out.println("the animal is running...");
    }

    
}
