package com.netcracker.model;

import javax.persistence.*;

@Entity
@Table(name = "cg_order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "order_id")
    private Integer id;

    @Column (name = "name")
    private String name;

    @OneToOne
    @JoinColumn(name = "destination_id")
    private Address destination;

    @OneToOne
    @JoinColumn(name = "location_id")
    private Address location;

    @OneToOne
    @JoinColumn(name = "driver_id")
    private Client driver;

    @OneToOne
    @JoinColumn(name = "box_id")
    private Box box;

    @Column (name = "price")
    private Integer price;

    @OneToOne
    @JoinColumn(name = "receiver_id")
    private Client receiver;

    @OneToOne
    @JoinColumn( name = "status_id")
    private Status status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        if(id != null) {
            this.id = id;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name !=null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public Address getDestination() {
        return destination;
    }

    public void setDestination(Address destination) {
        if(destination != null) {
            this.destination = destination;
        }
    }

    public Address getLocation() {
        return location;
    }

    public void setLocation(Address location) {
        if(location != null) {
            this.location = location;
        }
    }

    public Client getDriver() {
        return driver;
    }

    public void setDriver(Client driver) {
            this.driver = driver;
    }

    public Box getBox() {
        return box;
    }

    public void setBox(Box box) {
        if(box != null) {
            this.box = box;
        }
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        if(price != null)
        this.price = price;
    }

    public Client getReceiver() {
        return receiver;
    }

    public void setReceiver(Client receiver) {
        if(receiver != null) {
            this.receiver = receiver;
        }
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        if(status != null) {
            this.status = status;
        }
    }
}
