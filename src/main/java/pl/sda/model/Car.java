package pl.sda.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "car")

public class Car {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "carSeq")
    @GenericGenerator(name = "carSeq", strategy = "increment")
    private int id;

    @Column
    private String mark;

    @Column
    private String model;

    @Column
    private String colour;

    @Column
    private String regNumber;

    @Column
    private String condition;

    public Car() {
    }

    public Car(String mark, String model, String colour, String reg_number, String condition) {
        this.mark = mark;
        this.model = model;
        this.colour = colour;
        this.regNumber = reg_number;
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", reg_number='" + regNumber + '\'' +
                ", condition='" + condition + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id &&
                Objects.equals(mark, car.mark) &&
                Objects.equals(model, car.model) &&
                Objects.equals(colour, car.colour) &&
                Objects.equals(regNumber, car.regNumber) &&
                Objects.equals(condition, car.condition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, mark, model, colour, regNumber, condition);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}
