package com.common;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PersonalAccount implements Account{

    private int balance;
    private int bankCode;
    private String accNo;

    public PersonalAccount(int bankCode,String accNo){
        this.bankCode=bankCode;
        this.accNo=accNo;

    }
    @Override
    public String getBalance() {
        return "당신의 계좌 "+this.accNo+" 의 잔액은 "+formatcomma(this.balance)+" 원 입니다";
    }

    @Override
    public String deposit(int money) {
        if (money > 0) {
            this.balance+=money;
        return formatcomma(money) + " 원을 입금하였습니다";

        }
        else return "금액을잘못 입력";
    }

    @Override
    public String withdraw(int money) {

        if(this.balance>money){
            this.balance-=money;
        return formatcomma(money)+ " 원을 출금하였습니다";
        }
        else return "잔액이 부족합니다";
    }


    private String formatcomma(int balance){
        StringBuilder sb = new StringBuilder();
        Queue<Integer> q = new LinkedList<>();
        while(balance>1000){
            q.offer(balance%1000);
            balance=balance/1000;
        }
        q.offer(balance);
        while(q.size()>1){
            sb.append(q.poll());
            sb.append(",");


        }

        sb.append(q.poll());

        return sb.toString();

    }


}


