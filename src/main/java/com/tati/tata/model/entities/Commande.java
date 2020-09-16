package com.tati.tata.model.entities;

import antlr.collections.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Table(name = "COMMANDE")
@SuppressWarnings("serial")
public class Commande extends AbstractEntityGeneral{
    @Getter
    @Setter
    @OneToMany(cascade = CascadeType.MERGE)
    private List<Menu> toutLesMenus;
    @Getter
    @Setter
    private Client client;
    @Getter
    @Setter
    private LocalDate DateCommande;
}
