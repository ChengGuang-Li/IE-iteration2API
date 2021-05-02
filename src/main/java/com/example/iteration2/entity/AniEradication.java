package com.example.iteration2.entity;

import javax.persistence.*;

@Entity
@Table
public class AniEradication {
    @Id
    @SequenceGenerator(
            name = "animal_eradication_sequence",
            sequenceName = "animal_eradication_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "animal_eradication_sequence"
    )
    private int aeId;
    @ManyToOne
    @JoinColumn
    private  Animal animal;
    @ManyToOne
    @JoinColumn
    private  Eradication eradication;

    public AniEradication() {
    }

    public AniEradication(int aeId, Animal animal, Eradication eradication) {
        this.aeId = aeId;
        this.animal = animal;
        this.eradication = eradication;
    }
    //getter

    public int getAeId() {
        return aeId;
    }

    public Animal getAnimal() {
        return animal;
    }

    public Eradication getEradication() {
        return eradication;
    }
    //setter

    public void setAeId(int aeId) {
        this.aeId = aeId;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void setEradication(Eradication eradication) {
        this.eradication = eradication;
    }
    //toString

    @Override
    public String toString() {
        return "AniEradication{" +
                "aeId=" + aeId +
                ", animal=" + animal +
                ", eradication=" + eradication +
                '}';
    }
}
