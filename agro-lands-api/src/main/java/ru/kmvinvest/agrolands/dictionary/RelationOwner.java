package ru.kmvinvest.agrolands.dictionary;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum RelationOwner {
    CURRENT ("01", "Действующий собственник"),
    NOT_CONFIRMED ("02", "Ранее действующий собственник");


    public String code;
    public String name;

}
