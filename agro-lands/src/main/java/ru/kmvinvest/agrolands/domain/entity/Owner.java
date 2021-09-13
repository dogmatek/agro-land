package ru.kmvinvest.agrolands.domain.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity (name = "OWNER")
public class Owner extends AbstractIdentified {

    private static final long serialVersionUID = 2964676240739742844L;

    @Column(name = "NAME")
    private String name;

    @Column(name = "INN")
    private String inn;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "PHONE")
    private String phone;
}
