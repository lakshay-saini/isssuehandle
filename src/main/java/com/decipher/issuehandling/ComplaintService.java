package com.decipher.issuehandling;


import javax.jws.WebService;


@WebService
public class ComplaintService {
    
    private String greet = "hello word";

    public void setGreet(String greet) {
        this.greet = greet;
    }

    public String getGreet() {
        return greet;
    }
}
