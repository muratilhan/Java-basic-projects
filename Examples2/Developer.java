public class Developer extends Worker {
    

    public Developer(String name,int salary){
        super(name, salary);
        
    }
    public int getSalary(){
        return super.getSalary();
    }
    public void setSalary(int newSalary){
        super.setSalary(newSalary);
    }
}
