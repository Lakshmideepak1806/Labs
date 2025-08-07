package lab2;

public abstract class Acc2 {
		long accNum;
		static double balance;
		Person2 accHolder;
		public Acc2(long accNum, double balance, Person2 accHolder) {
			super();
			this.accNum = accNum;
			this.balance = balance;
			this.accHolder = accHolder;
		}
		
		public long getAccNum() {
			return accNum;
		}
		public void setAccNum(long accNum) {
			this.accNum = accNum;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		public Person2 getAccHolder() {
			return accHolder;
		}
		public void setAccHolder(Person2 accHolder) {
			this.accHolder = accHolder;
		}
		void deposit(double amount) {
			if(balance>0) {
				balance=balance+amount;
			}
		}
		public abstract boolean withdraw(double amount);
		@Override
		public String toString() {
			return "Account [accNum=" + accNum + ", balance=" + balance + ", accHolder=" + accHolder + "]";
		}
}
class SavingsAccount extends Acc2 {
    public SavingsAccount(long accNum, double balance, Person2 accHolder) {
		super(accNum, balance, accHolder);
		// TODO Auto-generated constructor stub
	}

	private static final double MINIMUM_BALANCE = 500.0;
	

    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= MINIMUM_BALANCE) {
            balance -= amount;
            return true;
        }
        System.out.println("Withdrawal failed: Minimum balance of ₹500 must be maintained.");
        return false;
    }
}

class CurrentAccount extends Acc2 {
    public CurrentAccount(long accNum, double balance, Person2 accHolder) {
		super(accNum, balance, accHolder);
		// TODO Auto-generated constructor stub
	}



	private double overdraftLimit;

   

    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= -overdraftLimit) {
            balance -= amount;
            return true;
        }
        System.out.println("Withdrawal failed: Overdraft limit exceeded.");
        return false;
    }
}