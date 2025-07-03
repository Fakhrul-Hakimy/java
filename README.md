[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/shoe1QBb)
## Your Info:
1. Matric Number:
1. Name:

## Instruction:

You are a backend developer for BankSecure, a financial system that processes transactions between multiple user accounts. During high transaction volume, your team observes that the system sometimes freezes due to indefinitely blocked threads. Initial investigation shows this happens when two transactions simultaneously try to lock two different user accounts (e.g., Ali and Badrul), but in reverse order, causing a deadlock.

Simulate this problem using Java by writing a multithreaded program with two account objects (Account A and Account B). Create two threads, where:

* Thread 1 tries to lock Account A, then Account B

* Thread 2 tries to lock Account B, then Account A

Add delays to simulate real processing time, and demonstrate how this setup leads to a deadlock. Print out log messages to show when each thread acquires a lock.

## Expected Output (example):
```
Thread 1: Locked A
Thread 2: Locked B
```
## Your Output/Result
