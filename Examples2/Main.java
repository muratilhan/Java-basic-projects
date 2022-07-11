public class Main{
    public static void main(String[] args) {
        Developer developer = new Developer("Murat", 7000);
        //System.out.println("developer salary is = "+developer.getSalary());
        developer.setSalary(10000);
        //System.out.println("developer salary is = "+developer.getSalary());
        Manager manager = new Manager("jack",10000,50);
        //System.out.println(manager.getSalary());
        manager.setSalary(20000);
        //System.out.println(manager.getSalary());
        //System.out.println(manager.getResponsibility());
    }




}