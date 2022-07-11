public class Worker{

    private String name;
    private int salary;

    public Worker(String name,int salary){
        this.name = name;
        this.salary = salary;
    }

    public void showInfos(){
        System.out.println("name = "+ name);
        System.out.println("salary = "+salary);
    }
}