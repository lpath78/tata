package com.tati.tata.converter;

import javax.persistence.AttributeConverter;
import java.util.UUID;

public class UUIDConverter implements AttributeConverter<UUID, String> {

    @Override
    public String convertToDatabaseColumn(UUID arg0){
        return arg0.toString();
    }

    @Override
    public UUID convertToEntityAttribute(String arg0) {
        return UUID.fromString(arg0);
    }

}
