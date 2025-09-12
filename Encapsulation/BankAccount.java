package Encapsulation;

class BankAccount{
    private float balance;
    public int accountNumber;

    public BankAccount(int accountNumber){
        if(Integer.toString(accountNumber).length() != 10){
            throw new IllegalArgumentException("Account number must be 10 digits");
        }
        this.accountNumber = accountNumber;
    }

    public void deposit(float amount){
        if(amount <= 0){
            throw new IllegalArgumentException("Deposit amount must be positive");
        }else{
            balance+=amount;
        }
    }
    public float withdraw(float amount){
        if(amount <= 0){
            throw new IllegalArgumentException("Withdraw amount must be positive");
        }
        if(amount > balance){
            throw new IllegalArgumentException("Insufficient balance");
        }
        balance-=amount;

    }
    public float getBalance(){
        return balance;
    }

    // by doing this, the user cannot directly access the balance variable
    // this is called data hiding
}