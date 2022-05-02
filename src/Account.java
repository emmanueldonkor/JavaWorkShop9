
 class Account {

    String owner;
    int balance, accountNumber;

    public Account(String owner, int balance, int accountNumber) {
        this.owner = owner;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {

        return balance;
    }

    public int setBalance(int balance) {
        return this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String methodPrint(){
        String result  = "Owner:" + getOwner();
        result += "\nBalance: " + getBalance();
        result += "\nAccountNumber: " + getAccountNumber();
        return result;
    }

    public void methodTransferEmman(double amount) throws NotEnoughMoneyException{
        if(balance >= amount){
         balance -= amount;}
        else{throw new NotEnoughMoneyException("There is insufficient amount in the account");}
    }
}


