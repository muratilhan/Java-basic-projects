public class Employee {
    String name;
    int salary;
    int workHours;
    int hireHours;
    public Employee(String name,int salary,int workHours,int hireHours){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireHours=hireHours;
    }
    public void tax(){
        if (this.salary>1000){
            System.out.println("the tax is = "+this.salary*(0.03));
        }
        else {
            System.out.println("there is no tax");
        }
    }

    public void bonus(){
        if (workHours>40){
            System.out.println("bonus is = "+(this.workHours-40)*30);
            this.salary+=(workHours-40)*30;
        }
    }
    public void raiseSalary(){
        if ((2021-this.hireHours)<10){
            
            System.out.println("the salary raise = "+(this.salary/20));
            this.salary+=this.salary*(5/100);
        } 
        else if ((2021-this.hireHours)>9 && (2021-this.hireHours)<20){
            
            System.out.println("the salary raise = "+this.salary*(1/10));
            this.salary+=this.salary*(1/10);
        }
        else if ((2021-this.hireHours)>19){
            
            System.out.println("the salary raise = "+this.salary*(15/100));
            this.salary+=this.salary*(15/100);
        }
    }       
    public void showInfos(){
        System.out.println("Name = "+this.name);
        System.out.println("Salary = "+this.salary);
        System.out.println("workHours = "+this.workHours);
        System.out.println("hireHours = "+this.hireHours);

    }

}
