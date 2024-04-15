package com.ejemplo.springboot.crud.crudrefugiodeanimales.entity;

import jakarta.persistence.*;

@Entity
@Table(name="animales")
public class Animal {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idanimal;
    private String nombre;
    private String color;
    private Integer edad;

    public Animal() {}

    public Animal(String nombre, String color, Integer edad) {
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
    }

    public Integer getIdanimal() {
        return idanimal;
    }

    public void setIdanimal(Integer idAnimal) {
        this.idanimal = idAnimal;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public Integer getEdad() {
        return edad;
    }
    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString(){
        return "Animal{" +
                "idanimal=" + idanimal +
                ", nombre='" + nombre + '\'' +
                ", color='" + color + '\'' +
                ", edad=" + edad +
                '}';
    }


}
