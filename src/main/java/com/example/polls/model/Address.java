package com.example.polls.model;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Embeddable
public class Address {
    @NotNull
    @Size(max = 100)
    private String addressLine1;

    @NotNull
    @Size(max = 100)
    private String addressLine2;

    @NotNull
    @Size(max = 100)
    private String city;

    @NotNull
    @Size(max = 100)
    private String state;


    @NotNull
    @Size(max = 100)
    private String country;

    @NotNull
    @Size(max = 6)
    private String zipCode;

    Address(){
        
    }

    public Address(String addressLine1, String addressLine2,String zipCode) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.zipCode = zipCode;
    }

    // Getters and Setters (Omitted for brevity)

    public void SetAddressLine1(String addressLine1){
      this.addressLine1=addressLine1;
    }

    public String GetAddressLine1(){
        return this.addressLine1;
    }

      public void SetAddressLine2(String addressLine2){
        this.addressLine2=addressLine2;
      }
  
      public String GetAddressLine2(){
          return this.addressLine1;
      }

      
      public void SetZipCode(String zipcode){
        this.zipCode=zipcode;
      }
  
      public String GetZipCode(){
          return this.zipCode;
      }


}