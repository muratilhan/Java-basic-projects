public class Worker {

    private String name;
    private int salary;

    public Worker(String name,int salary){
        this.name=name;
        this.salary=salary;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getSalary(){
        return this.salary;
    }
    public void setSalary(int newSalary){
        this.salary=newSalary;
    }
    

    public void work(){
        System.out.println("workers are working");
    }

    
}
