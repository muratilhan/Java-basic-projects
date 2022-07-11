public class Manager extends Worker{

    private int responsibility;

    public Manager(String name,int salary,int responsibility){
        super(name,salary);
        this.responsibility=responsibility;
    }

    public void setSalary(int salary){
        super.setSalary(salary);
    }
    public int getSalary(){
        return super.getSalary();
    }
    public int getResponsibility(){
        return this.responsibility;
    }


    
    
    
}
