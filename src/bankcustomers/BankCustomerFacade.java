/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankcustomers;

import gencustaccount.AccountIf;
import gencustaccount.CustomerIf;
import java.util.ArrayList;

/**
 *
 * @author tasanajb
 */
public class BankCustomerFacade {
   private final ArrayList<AccountIf> cust1Accounts = new ArrayList();
   private final ArrayList<AccountIf> cust2Accounts = new ArrayList();
       
       public void cust1(){
           AccountIf acc = new BankAccount(12345);
           acc.deposit(500);
           cust1Accounts.add(acc);
           acc = new BankAccount(12346);
           acc.deposit(1000);
           cust1Accounts.add(acc);
           CustomerIf cust = new BankCustomer("John", cust1Accounts);
           getBanCustomer(cust.getCustomerName());
       }
       
       public void cust2(){
           AccountIf acc = new BankAccount(12347);
           acc.deposit(500);
           //doDeposit(4,acc.getBalance(),acc.getAccountNumber());
           cust2Accounts.add(acc);
           acc = new BankAccount(12348);
           acc.deposit(1000);
           cust2Accounts.add(acc);
           CustomerIf cust = new BankCustomer("Janny", cust2Accounts);
           getBanCustomer(cust.getCustomerName());
       }
       
       
       public void doDeposit(double amt, CustomerIf cust, int accNo){
           //System.out.println("Account Number: " + acc.getAccountNumber() + " has " + acc.getBalance());
       
       }
       
       public void getBankAccount(CustomerIf cust, int accNo){
           
       }
       
       public void getBanCustomer(String custName){
           System.out.println("Name = " + custName);
           System.out.println("Has " + custName + " accounts");
       }
}
