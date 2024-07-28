package com.example.transactionsbackend;

import com.example.transactionsbackend.Transactionsbackend;
import com.example.transactionsbackend.TransactionsbackendRepository;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.*;


public class TransactionsbackendService implements TransactionsbackendRepository{
    private static HashMap<Integer,Transactionsbackend> translist = new HashMap<>();

    public TransactionsbackendService(){
        translist.put(1,new Transactionsbackend(1,22-3-14,200,"Snacks","debit",2000));
    }

    int uniqueId=2;
    @Override

    public ArrayList<Transactionsbackend> getTransactions(){
        Collection<Transactionsbackend> transcoll=translist.values();
        ArrayList<Transactionsbackend> arrl=new ArrayList<>(transcoll);
        return arrl;
    }
    @Override
    public Transactionsbackend addTransaction(Transactionsbackend transaction){
      transaction.setId(uniqueId);
      translist.put(uniqueId,transaction);
      uniqueId+=1;
      return transaction;
    }
}
