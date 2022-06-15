public class Account {
   int balance;

   public Account(int openingBalance) {
      balance = openingBalance;
   }

   public void deposit(int pesos) {
      balance = balance + pesos;
   }

   public boolean withdraw(int pesos) {
      if (balance < pesos)
         return false;
      else {
         balance = balance - pesos;
         return true;
      }
   }

   public boolean transfer (int pesos, Account destination) {
      if (withdraw(pesos)) {
         destination.deposit(pesos);
         return true;
      }else
         return false;
   }
   public String toString() {
      return ("Php " + balance + ".00");
   }
   
   public static void main(String args[]){
        Account alice = new Account(100);
        Account bob = new Account(100);
        alice.deposit(25);                              
        System.out.println("Alice has " + alice); // Line 1 toString() method is invoked
        System.out.println("Bob can withdraw  Php 125.00? " + bob.withdraw(125)); // Line 2
        System.out.println("Bob can withdraw  Php 25.00? " + bob.withdraw(25)); // Line 3
        System.out.println("Bob has " + bob); // Line 4 toString() method is invoked
        Account charlie = alice;                        
        System.out.println("Charlie can withdraw Php 25.00? " + charlie.withdraw(25)); // Line 5
        System.out.println("Charlie has " + charlie); // Line 6 toString() method is invoked
        System.out.println("Alice has " + alice); // Line 7 toString() method is invoked
        alice.transfer(50, charlie);
        System.out.println("After transfer..."); // Line 8
        System.out.println("Charlie has " + charlie); //  Line 9 toString() method is invoked
        System.out.println("Alice has " + alice); // Line 10 toString() method is invoked
   }
}
