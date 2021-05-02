package com.example.iteration2.entity;



import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class Animal {
    @Id
    @SequenceGenerator(
            name = "animal_sequence",
            sequenceName = "animal_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "animal_sequence"
    )
    private int aId;
    private String name;
    @OneToMany(mappedBy = "animal")
    private Set<AniEradication> aniEradicationSet;

    public Animal() {
    }

    public Animal(int aId, String name, Set<AniEradication> aniEradicationSet) {
        this.aId = aId;
        this.name = name;
        this.aniEradicationSet = aniEradicationSet;
    }

    //getter

    public int getaId() {
        return aId;
    }

    public String getName() {
        return name;
    }

    public Set<AniEradication> getAniEradicationSet() {
        return aniEradicationSet;
    }
    //setter

    public void setaId(int aId) {
        this.aId = aId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAniEradicationSet(Set<AniEradication> aniEradicationSet) {
        this.aniEradicationSet = aniEradicationSet;
    }

    //toString


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
