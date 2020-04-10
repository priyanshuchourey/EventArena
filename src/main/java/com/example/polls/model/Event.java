package com.example.polls.model;

import javax.persistence.*;
import com.example.polls.model.audit.DateAudit;

@Entity
@Table(name = "events")
public class Event extends DateAudit {
    @Id
    @GeneratedValue(generator = "id_generator")
    @SequenceGenerator(
            name = "id_generator",
            sequenceName = "id_sequence",
            initialValue = 1000
    )
    private Long id;

    @Column(columnDefinition = "text")
    private String eventName;

    @Column
    private int cityId;

    @Column
    private int categoryId;

    @Embedded
    @AttributeOverrides(value = {
        @AttributeOverride(name = "addressLine1", column = @Column(name = "house_number")),
        @AttributeOverride(name = "addressLine2", column = @Column(name = "street"))
    })

    private Address address;

    public Event(String eventName, int cityId, int categoryId, Address address){
     this.eventName=eventName;
     this.cityId=cityId;
     this.address=address;
     this.categoryId=categoryId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
