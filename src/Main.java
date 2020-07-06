public class Main {





    public static void main(String[] args) {


        Person firstName = new Person ("Johnny","Cash\n");
        System.out.println(firstName);

        getFullName fNames = new getFullName();


        fNames.getName("John","Doe");
        fNames.getName("Christian", "Sander");
        fNames.getName("Sebastian", "Miller");

        System.out.println("\n");


        System.out.println("BANK ACCOUNT");
        BankAccount2 chrisSavings = new BankAccount2(200);

        chrisSavings.payment(45);
        chrisSavings.payment(-300);
        if (chrisSavings.getBalance()>= 0){
            System.out.println("Your Balance is: "+chrisSavings.getBalance());
        }else
            System.out.println("WARNING overdraft, your debts are: "+(chrisSavings.getBalance()*-1));






    }
}
