package com.сalculation.entity;

import javax.persistence.*;
import javax.validation.constraints.Min;

@Entity
@Table(name = "history")
public class Coefficients {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;

    @Column(name = "a")
    @Min(value = 1, message = "значение а должно быть больше 0")
    int cofA;

    @Column(name = "b")
    int cofB;

    @Column(name = "c")
    int cofC;

    @Column(name = "x1")
    double x1;

    @Column(name = "x2")
    double x2;

    public Coefficients() {
    }

    public Coefficients(int cofA, int cofB, int cofC) {
        this.cofA = cofA;
        this.cofB = cofB;
        this.cofC = cofC;
    }

    public int getCofA() {
        return cofA;
    }

    public void setCofA(int cofA) {
        this.cofA = cofA;
    }

    public int getCofB() {
        return cofB;
    }

    public void setCofB(int cofB) {
        this.cofB = cofB;
    }

    public int getCofC() {
        return cofC;
    }

    public void setCofC(int cofC) {
        this.cofC = cofC;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public String calculateQuadraticFormula() {
        double D = cofB * cofB - 4 * cofA * cofC;
        if (D > 0) {
            x1 = (-cofB - Math.sqrt(D)) / (2 * cofA);
            x2 = (-cofB + Math.sqrt(D)) / (2 * cofA);
            return "Корни уравнения: x1 = " + x1 + ", x2 = " + x2;
        } else if (D == 0) {
            double x;
            x = -cofB / (2 * cofA);
            return "Уравнение имеет единственный корень: x = " + x;
        } else {
            return "Уравнение не имеет действительных корней!";
        }
    }
}
