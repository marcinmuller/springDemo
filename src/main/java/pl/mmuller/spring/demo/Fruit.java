package pl.mmuller.spring.demo;

import javax.persistence.*;

@Entity
@Table(name="fruits")
public class Fruit {
    @Column(name = "color")
    private String color;
    @Column(name = "shape")
    private String shape;
    @Id
    @Column(name = "name")
    private String name;

    public Fruit() {
    }

    public Fruit(String color, String shape, String name) {
        this.color = color;
        this.shape = shape;
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public void setName(String name) {
        this.name = name;
    }
}