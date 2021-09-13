package ru.kmvinvest.agrolands.domain.entity;

import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "OWNER_LAND")
public class OwnerToLand extends AbstractIdentified {

    private static final long serialVersionUID = 982887908597913919L;

    @Column(name = "RELATION_TYPE")
    private String relationType;

    @Column(name = "OCCURRENCE_RIGHTS")
    private String occurrenceRights;

    @Column(name = "TERMINATION_RIGHTS")
    private String terminationRights;

    @ManyToOne(fetch= FetchType.EAGER)
    @JoinColumn(name = "LAND_ID")
    @Fetch(FetchMode.JOIN)
    private Land land;

    @ManyToOne(fetch= FetchType.EAGER)
    @JoinColumn(name = "OWNER_ID")
    @Fetch(FetchMode.JOIN)
    private Owner owner;
}
