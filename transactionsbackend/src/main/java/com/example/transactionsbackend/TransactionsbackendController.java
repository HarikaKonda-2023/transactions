package com.example.transactionsbackend;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.example.transactionsbackend.TransactionsbackendService;
import com.example.transactionsbackend.Transactionsbackend;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public  class TransactionsbackendContoller {
   TransactionsbackendService trans=new TransactionsbackendService(); 

   @GetMapping("/")
   public ArrayList<Transactionsbackend> getTransactions(){
    return trans.getTransactions();
   }

   @PostMapping("/add")
   public Transactionsbackend addTransaction(@RequestBody Transactionsbackend transaction)
{
    return trans.addTransaction(transaction);
}

}

