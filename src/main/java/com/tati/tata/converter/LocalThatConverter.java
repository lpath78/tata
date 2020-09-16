package com.tati.tata.converter;

import javax.persistence.AttributeConverter;
import java.sql.Date;
import java.time.LocalDate;

public class LocalThatConverter implements AttributeConverter<LocalDate, Date> {
    // On a converti une local date en sql
    @Override
    public Date convertToDatabaseColumn(LocalDate arg0) {
        return Date.valueOf(arg0);
    }
    // On a converti une date sql en java
    @Override
    public LocalDate convertToEntityAttribute(Date arg0) {
        return arg0.toLocalDate();
    }
}
