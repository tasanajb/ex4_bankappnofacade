/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankfacade;

import bankcustomers.BankAccount;
import bankcustomers.BankCustomer;
import gencustaccount.AccountIf;
import gencustaccount.CustomerIf;
import java.util.ArrayList;

/**
 *
 * @author sarun
 */
public class BankFacade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Customer and account information");
       BankCustomerFacad  bankCustomerFacad = new BankCustomerFacad();
       bankCustomerFacad.cust1();
       bankCustomerFacad.cust2(); 
    }
    
}
