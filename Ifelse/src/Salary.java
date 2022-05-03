public class Salary {

    public static void salary(String name, int id, double salary) {
       double hra = (salary * 10) / 100;//HRA is 10% of basic salary
       double ta = (salary * 9) / 100;//TA is 9% of salary
       double da = (salary * 8) / 100;//DA is 8% of salary
       double pf = (salary * 20) / 100;//PF is 20% of salary
       double gross = (salary + hra + ta + da - pf);//Gross salary is addition of Basic,hra, ta, da and deduction of pf

        System.out.println("Employee Name is " + name);
        System.out.println("Employee Id is " + id);
        System.out.println("Basic salary of employee is " + salary);
        System.out.println("HRA of basic salary is " + hra);
        System.out.println("TA of basic salary is " + ta);
        System.out.println("DA of basic salary is " + da);
        System.out.println("PF of basic salary is " + pf);
        System.out.println("Gross salary of employee is "+ gross);


    }
    public static void main(String args[]){

        salary("Rudra",46,50000);

    }
}