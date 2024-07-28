package com.example.transactionsbackend;

import java.util.*;


public interface TransactionsbackendRepository {
  
    ArrayList<Transactionsbackend> getTransactions();

    Transactionsbackend  addTransaction(Transactionsbackend transaction);

    
}
