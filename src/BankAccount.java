import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class BankAccount {

    private final String accountName;
    private final String accountNumber;
    private float accountBalance;
    List<String> transaction;
    private boolean accountClosure;
    private Date accountCreation;
    private Date accountEnd;

    public BankAccount(String accountName) {

        this.accountName = accountName;
        this.accountNumber = generateAccountNumber();
        this.accountBalance = 0.0f;

        LocalDateTime currentDateTime = LocalDateTime.now();
        ZoneId myZone = ZoneId.systemDefault();
        this.accountCreation = Date.from(currentDateTime.atZone(myZone).toInstant());

        if (transaction == null) {
            transaction = new ArrayList<>();
        }

    }

    public BankAccount(String accountName, float accountBalance) {

        this.accountName = accountName;
        this.accountNumber = generateAccountNumber();
        this.accountBalance = accountBalance;

        LocalDateTime currentDateTime = LocalDateTime.now();
        ZoneId myZone = ZoneId.systemDefault();
        this.accountCreation = Date.from(currentDateTime.atZone(myZone).toInstant());

        if (transaction == null) {
            transaction = new ArrayList<>();
        }

    }

    private String generateAccountNumber() {
        Random rand = new Random();
        String accountNumber = "";

        int asciiStart = 48;
        int asciiEnd = 57;
        int acctLength = 12;

        for (int i = 0; acctLength > i; i++) {
            int randomValue = rand.nextInt(asciiEnd - asciiStart) + asciiStart;
            accountNumber += (char) randomValue;
            
        }

        return accountNumber;
        
    }

    public void deposit(float amt){
        if (!isAccountClosure()){

            if (amt > 0.0f) {
            this.accountBalance += amt;

            transaction.add("Deposited " + amt + " at" + LocalDateTime.now().toString());
            } else {
                throw new IllegalArgumentException("You can't deposit negative values");
            } 
        
        } else {
            throw new IllegalArgumentException("You're account is closed");
            }

    }

    public void withdraw(float amt){
        if (!isAccountClosure()){

            if(getAccountBalance() > amt){
                this.accountBalance -= amt;
                transaction.add("Withdrew " + amt + " at" + LocalDateTime.now().toString());

            } else {
                throw new IllegalArgumentException("You don't have enough");
            } 
        } else {
            throw new IllegalArgumentException("You're account is closed");
            }


    }


    public String getAccountName() {
        return accountName;
    }

    // public void setAccountName(String accountName) {
    //     this.accountName = accountName;
    // }
    

    public String getAccountNumber() {
        return accountNumber;
    }

    // public void setAccountNumber(String accountNumber) {
    //     this.accountNumber = accountNumber;
    // }

    public float getAccountBalance() {
        return accountBalance;
    }

    //   public void setAccountBalance(float accountBalance) {
    //       this.accountBalance = accountBalance;
    //  }

    public List<String> getTransaction() {
        return transaction;
    }

    public void setTransaction(List<String> transaction) {
        this.transaction = transaction;
    }

    public boolean isAccountClosure() {
        return accountClosure;
    }

    public void setAccountClosure(boolean accountClosure) {
        this.accountClosure = accountClosure;
    }

    public Date getAccountCreation() {
        return accountCreation;
    }

    public void setAccountCreation(Date accountCreation) {
        this.accountCreation = accountCreation;
    }

    public Date getAccountEnd() {
        return accountEnd;
    }

    public void setAccountClosing(Date accountEnd) {
        this.accountEnd = accountEnd;
    }

}