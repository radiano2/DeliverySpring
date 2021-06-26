package group.demo.CompleteOrder;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Entity
@Table
public class CompleteOrderModel {
    Calendar calendar = Calendar.getInstance();
    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

    @Id
    @SequenceGenerator(
            name = "completeOrderSequence",
            sequenceName = "completeOrderSequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "completeOrderSequence"
    )
    private Long id;
    private String name;
    private String surname;
    private Double price;
    @Transient
    private final String orderDate = formatter.format(calendar.getTime()).toString();
    private String list_of_dishes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public String getList_of_dishes() {
        return list_of_dishes;
    }

    public void setList_of_dishes(String list_of_dishes) {
        this.list_of_dishes = list_of_dishes;
    }

    public CompleteOrderModel(String name, String surname, Double price, String list_of_dishes) {
        this.name = name;
        this.surname = surname;
        this.price = price;
        this.list_of_dishes = list_of_dishes;
    }

    public CompleteOrderModel() {
    }
}
