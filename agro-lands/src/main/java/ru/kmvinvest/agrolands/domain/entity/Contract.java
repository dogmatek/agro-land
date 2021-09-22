package ru.kmvinvest.agrolands.domain.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "CONTRACT")
public class Contract extends AbstractIdentified {

    private static final long serialVersionUID = -523123346917907067L;

    @Column(name = "NUMBER")
    private String number;

    @Column(name = "CREATED")
    private LocalDate created;

    @Column(name = "DESCRIPTION")
    private String description;

    @OneToMany(mappedBy = "contract", fetch = FetchType.EAGER)
    private List<ContractToLands> contractToLands;
}
