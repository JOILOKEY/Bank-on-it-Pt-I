**Bank-on-it-Pt-I**

**Classes**


CheckingAccount: Represents a checking account with a balance. It can check balance, make deposits, and withdrawals.


HasMenu Interface: Requires menu() and start() methods for the menu and starting the program.


**Variables and Constructors**


balance: Holds the account balance.


input: A Scanner for user input.


Constructors: One sets the balance to 0.0, and the other allows setting a custom balance.

**Methods**


getBalance(): Returns the current balance.


getBalanceString(): Formats the balance as a string with a dollar sign.


setBalance(double balance): Updates the balance.

menu()  Displays options:

0) Quit

1) Check balance

2) Deposit money

3) Withdraw money

start() 

Shows the menu and reads user input.

Based on choice, it either quits, checks balance, deposits money, or withdraws money.

**Methods for Operations**


checkBalance(): Displays the current balance.


makeDeposit(): Asks for an amount, adds it to the balance, and confirms.


makeWithdrawal(): Asks for an amount, checks if the user has enough money, and either withdraws or shows an error.


main():

Creates a CheckingAccount with $100.00 and starts the menu
