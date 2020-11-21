package pl.sda.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "current_rentals")

public class CurrentRentals {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "currentRentalsSeq")
    @GenericGenerator(name = "currentRentalsSeq", strategy = "increment")
    private int id;

    @ManyToOne
    private String rentId;

    @ManyToOne
    private String custId;

    @Column
    private String regNumber;

    @Column
    private String rentDate;

    @Column
    private String returnDate;

    public CurrentRentals() {
    }

    public CurrentRentals(String rentId, String custId, String regNumber, String rentDate, String returnDate) {
        this.rentId = rentId;
        this.custId = custId;
        this.regNumber = regNumber;
        this.rentDate = rentDate;
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "CurrentRentals{" +
                "id=" + id +
                ", rent_id='" + rentId + '\'' +
                ", cust_id='" + custId + '\'' +
                ", reg_number='" + regNumber + '\'' +
                ", rent_date='" + rentDate + '\'' +
                ", return_date='" + returnDate + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CurrentRentals that = (CurrentRentals) o;
        return id == that.id &&
                Objects.equals(rentId, that.rentId) &&
                Objects.equals(custId, that.custId) &&
                Objects.equals(regNumber, that.regNumber) &&
                Objects.equals(rentDate, that.rentDate) &&
                Objects.equals(returnDate, that.returnDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, rentId, custId, regNumber, rentDate, returnDate);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRentId() {
        return rentId;
    }

    public void setRentId(String rentId) {
        this.rentId = rentId;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getRentDate() {
        return rentDate;
    }

    public void setRentDate(String rentDate) {
        this.rentDate = rentDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }
}
