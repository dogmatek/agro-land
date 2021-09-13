package ru.kmvinvest.agrolands.domain.entity;



import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Currency;
import java.util.List;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "LAND")
public class Land extends AbstractIdentified {

    private static final long serialVersionUID = -523123346917907067L;

    @Column(name = "CAD_NUM")
    private String cadNum;

    @Column(name = "CAD_PRICE")
    private Currency cadPrice;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "AREA")
    private Integer area;

    @Column(name = "CREATED")
    private LocalDate created;
    @OneToMany(mappedBy = "land", fetch = FetchType.EAGER)
    private List<OwnerToLand> ownerToLands;
}
