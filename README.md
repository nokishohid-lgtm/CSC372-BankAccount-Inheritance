# CSC372 BankAccount Inheritance

## Course
CSC372 Programming II

## Module
Module 8: Classes and Object-Oriented Concepts in Java

## Student
Noki Shohid

## Project Overview
This Java project demonstrates object-oriented programming and inheritance using a BankAccount superclass and a CheckingAccount subclass.

The CheckingAccount class inherits common account features from BankAccount and adds an interest rate and overdraft processing with a $30 fee.

## Classes
- `BankAccount.java` - Contains customer information, account ID, balance, deposits, withdrawals, getters, setters, and account summary.
- `CheckingAccount.java` - Extends BankAccount and adds an interest rate and overdraft processing.
- `BankAccountTest.java` - Tests normal withdrawals, overdrafts, deposits, and account information.

## Test Results

### Test Case 1 - Normal Withdrawal
- Deposit: $1,000.00
- Withdrawal: $250.00
- Final balance: $750.00
- No overdraft fee

### Test Case 2 - Overdraft
- Deposit: $100.00
- Withdrawal: $150.00
- Overdraft fee: $30.00
- Final balance: -$80.00

### Test Case 3 - Deposit and Withdrawal
- Deposit: $300.00
- Withdrawal: $50.00
- Final balance: $250.00

## Technologies
- Java
- IntelliJ IDEA
- Git
- GitHub

## Evidence
Lab screenshots are stored in the `screenshots` directory.