package pl.sda.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

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
    private String reg_number;

    @Column
    private String condition;

    public Car() {
    }

    public Car(String mark, String model, String colour, String reg_number, String condition) {
        this.mark = mark;
        this.model = model;
        this.colour = colour;
        this.reg_number = reg_number;
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", reg_number='" + reg_number + '\'' +
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
                Objects.equals(reg_number, car.reg_number) &&
                Objects.equals(condition, car.condition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, mark, model, colour, reg_number, condition);
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

    public String getReg_number() {
        return reg_number;
    }

    public void setReg_number(String reg_number) {
        this.reg_number = reg_number;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}
