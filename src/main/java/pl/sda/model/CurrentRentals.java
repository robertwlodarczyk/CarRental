package pl.sda.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

public class CurrentRentals {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "currentRentalsSeq")
    @GenericGenerator(name = "currentRentalsSeq", strategy = "increment")
    private int id;

    @Column
    private String rent_id;

    @Column
    private String cust_id;

    @Column
    private String reg_number;

    @Column
    private String rent_date;

    @Column
    private String return_date;

    public CurrentRentals() {
    }

    public CurrentRentals(String rent_id, String cust_id, String reg_number, String rent_date, String return_date) {
        this.rent_id = rent_id;
        this.cust_id = cust_id;
        this.reg_number = reg_number;
        this.rent_date = rent_date;
        this.return_date = return_date;
    }

    @Override
    public String toString() {
        return "CurrentRentals{" +
                "id=" + id +
                ", rent_id='" + rent_id + '\'' +
                ", cust_id='" + cust_id + '\'' +
                ", reg_number='" + reg_number + '\'' +
                ", rent_date='" + rent_date + '\'' +
                ", return_date='" + return_date + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CurrentRentals that = (CurrentRentals) o;
        return id == that.id &&
                Objects.equals(rent_id, that.rent_id) &&
                Objects.equals(cust_id, that.cust_id) &&
                Objects.equals(reg_number, that.reg_number) &&
                Objects.equals(rent_date, that.rent_date) &&
                Objects.equals(return_date, that.return_date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, rent_id, cust_id, reg_number, rent_date, return_date);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRent_id() {
        return rent_id;
    }

    public void setRent_id(String rent_id) {
        this.rent_id = rent_id;
    }

    public String getCust_id() {
        return cust_id;
    }

    public void setCust_id(String cust_id) {
        this.cust_id = cust_id;
    }

    public String getReg_number() {
        return reg_number;
    }

    public void setReg_number(String reg_number) {
        this.reg_number = reg_number;
    }

    public String getRent_date() {
        return rent_date;
    }

    public void setRent_date(String rent_date) {
        this.rent_date = rent_date;
    }

    public String getReturn_date() {
        return return_date;
    }

    public void setReturn_date(String return_date) {
        this.return_date = return_date;
    }
}
