public class FixedBankAccount extends BankAccount{

    private float interest;
    private Integer duration;

    public FixedBankAccount(String accountName, float accountBalance) {
        super(accountName, accountBalance);

        this.interest = 3.0f;
        this.duration = 6;
    }

    public FixedBankAccount(String accountName, float accountBalance, float interest) {
        super(accountName, accountBalance);

        this.interest = interest;
        this.duration = 6;
    }

    public FixedBankAccount(String accountName, float accountBalance, float interest, Integer duration) {
        super(accountName, accountBalance);

        this.interest = interest;
        this.duration = duration;
    }

    public float getInterest() {
        return interest;
    }
    public void setInterest(float interest) {
        this.interest = interest;
    }
    public Integer getDuration() {
        return duration;
    }
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    @Override
    public void deposit(float amt) {
        System.out.println("Operation not allowed");
    }

    @Override
    public void withdraw(float amt) {
        System.out.println("Operation not allowed");
    }

    @Override
    public float getAccountBalance() {
        // balance plus the interest viz if interest is 3 and balance is 100, the getBalance() 
        // should return 103
        float total = this.getAccountBalance() * ((this.interest / 100.0f) * this.duration);
        return total;
    }


}
