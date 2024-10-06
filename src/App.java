public class App {

    public static void main(String[] args){

        BankAccount Ronaldo = new BankAccount("Cristiano Ronaldo");
        System.out.println(Ronaldo.getAccountNumber());
        System.out.println(Ronaldo.getAccountName());
        System.out.println(Ronaldo.getAccountCreation());
        System.out.println(Ronaldo.isAccountClosure());
        System.out.println(Ronaldo.getAccountBalance());
        Ronaldo.deposit(100);
        System.out.println(Ronaldo.getAccountBalance());
        Ronaldo.withdraw(50);
        System.out.println(Ronaldo.getAccountBalance());
        System.out.println(Ronaldo.getTransaction());
        
    }

    
}
