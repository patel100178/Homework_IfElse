public class Sales {
    static double commission;
    public static void salesCommission(int id, String name, double salesAmount, double basicSalary ) {

        System.out.println("Sales Id is " + id);
        System.out.println("Seller's name is " + name);
        System.out.println("Sales amount is " + salesAmount);
        System.out.println("Basic salary is " + basicSalary);

        if (salesAmount >= 50000) {
            commission = salesAmount * 35 / 100;
            System.out.println("Commission amount is " + commission);
        } else if (salesAmount >= 30000) {
            commission = salesAmount * 20 / 100;
            System.out.println("Commission amount is " + commission);
        } else if (salesAmount >= 20000) {
            commission = salesAmount * 10/ 100;
            System.out.println("Commission amount is " + commission);
        } else if (salesAmount >= 10000) {
            commission = salesAmount * 5 / 100;
            System.out.println("Commission amount is " + commission);
        } else if (salesAmount < 10000) {
            commission = salesAmount * 2 / 100;
            System.out.println("Commission amount is " + commission);
        }

        }
        public static void main (String args[]){

           salesCommission(01,"Jatin",125000,30000);
        }
    }
