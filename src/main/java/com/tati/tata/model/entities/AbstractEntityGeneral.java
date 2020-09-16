package com.tati.tata.model.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.UUID;

@MappedSuperclass
@ToString(of = "id")
@EqualsAndHashCode(of = "id")
@SuppressWarnings("serial")
public class AbstractEntityGeneral implements Serializable {

    @Getter
    @Id
    private String id;
    public AbstractEntityGeneral(){
        this.id = UUID.randomUUID().toString();
    }
}
