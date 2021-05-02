package com.example.iteration2.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class Eradication {
    @Id
    @SequenceGenerator(
            name = "eradication_sequence",
            sequenceName = "eradication_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "eradication_sequence"
    )
    private int eId;
    private String name;
    private String description;
    private String advantages;
    private String disadvantages;
    private String type;
    private String image;
    private String readMore;

    @OneToMany(mappedBy = "eradication")
    private Set<AniEradication> aniEradicationSet;

    public Eradication() {
    }

    public Eradication(int eId, String name, String description, String advantages, String disadvantages, String type, String image, String readMore, Set<AniEradication> aniEradicationSet) {
        this.eId = eId;
        this.name = name;
        this.description = description;
        this.advantages = advantages;
        this.disadvantages = disadvantages;
        this.type = type;
        this.image = image;
        this.readMore = readMore;
        this.aniEradicationSet = aniEradicationSet;
    }

    //getter


    public int geteId() {
        return eId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getAdvantages() {
        return advantages;
    }

    public String getDisadvantages() {
        return disadvantages;
    }

    public String getType() {
        return type;
    }

    public Set<AniEradication> getAniEradicationSet() {
        return aniEradicationSet;
    }

    public String getImage() {
        return image;
    }

    public String getReadMore() {
        return readMore;
    }

    //setter

    public void seteId(int eId) {
        this.eId = eId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAdvantages(String advantages) {
        this.advantages = advantages;
    }

    public void setDisadvantages(String disadvantages) {
        this.disadvantages = disadvantages;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setReadMore(String readMore) {
        this.readMore = readMore;
    }

    public void setAniEradicationSet(Set<AniEradication> aniEradicationSet) {
        this.aniEradicationSet = aniEradicationSet;
    }
    //toString

    @Override
    public String toString() {
        return "Eradication{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", advantages='" + advantages + '\'' +
                ", disadvantages='" + disadvantages + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
