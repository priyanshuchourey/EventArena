package com.example.polls.payload;

import javax.validation.constraints.NotBlank;

import com.example.polls.model.Address;

public class EventRequest {
    @NotBlank
    private String eventName;

    @NotBlank
    private int cityId;

    @NotBlank
    private int categoryId;

    @NotBlank
    private Address address;

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getCategoryId() {
        return cityId;
    }

    public void setCategoryId(int cityId) {
        this.cityId = cityId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
