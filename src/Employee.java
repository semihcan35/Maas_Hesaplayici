public class Employee {
    String name;
    int salary,workHours,hireYear;
    Employee(String name , int salary , int workHours , int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

    void tax(){
        if(this.salary>1000){
            double taxSalary = this.salary-(this.salary*0.03);
            System.out.println("Vergi sonrası maaş:" + taxSalary);
        }if(this.salary<1000){
            System.out.println("Vergi sonrası maaş:"+ this.salary);
        }
    }

    void bonus(){
        int extraHours;
        if(this.workHours>=40){
            extraHours=this.workHours-40;
            int bonus = extraHours *30;
            this.salary += bonus;
            System.out.println("Ekstra çalışma bonusu: "+ bonus);
        }
}

    void raiseSalary(){
        double bonus;
        if(this.hireYear<10){
            bonus= (this.salary*0.05);
            this.salary += bonus;
            System.out.println("Çalışma yılına göre yeni maaş: "+ this.salary);

        }if(9<this.hireYear && this.hireYear<20){
            bonus=this.salary*0.1;
            this.salary += bonus;
            System.out.println("Çalışma yılına göre yeni maaş: "+ this.salary);
        }
        if(this.hireYear>19){
            bonus=this.salary*0.19;
            this.salary += bonus;
            System.out.println("Çalışma yılına göre yeni maaş:"+ this.salary);
        }
        }



}











