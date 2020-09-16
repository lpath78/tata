package com.tati.tata.model.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.UUID;

@MappedSuperclass
@ToString(of = "id")
@EqualsAndHashCode(of = "id")
@SuppressWarnings("serial")
@NoArgsConstructor
public class AbstractEntityGeneral implements Serializable {

    @Getter
    private final UUID id = UUID.randomUUID();

}
