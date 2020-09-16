package com.tati.tata.converter;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.UUID;

@Component
@NoArgsConstructor
public class UUIDConverter implements AttributeConverter<UUID, String> {

    @Override
    public String convertToDatabaseColumn(UUID arg0) {
        return arg0.toString();
    }

    @Override
    public UUID convertToEntityAttribute(String arg0) {

        return UUID.fromString(arg0);
    }

}
