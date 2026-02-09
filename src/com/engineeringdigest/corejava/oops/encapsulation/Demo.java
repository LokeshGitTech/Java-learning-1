package com.engineeringdigest.corejava.oops.encapsulation;

public class Demo {
    private int id;

    private String name;

    private String BankAccountNumber;

    public String getBankAccountNumber() {
        return BankAccountNumber;
    }

    public void setId(int id) {
        if(id<10)
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
            if(name.equals("lalit"))
            this.BankAccountNumber = bankAccountNumber;
    }

    public String setBankAccountNumber() {
        return BankAccountNumber;
    }



}
