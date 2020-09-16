package com.tati.tata.model.entities;

import antlr.collections.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Table(name = "COMMANDE")
@SuppressWarnings("serial")
public class Commande extends AbstractEntityGeneral{
    @Getter
    @Setter
    @OneToMany(cascade = CascadeType.MERGE)
    @JoinColumn(name = "ListeMenu")
    private List<Menu> toutLesMenus;
    @Getter
    @Setter
    @OneToOne(cascade = CascadeType.MERGE)
    private Client client;
    @Getter
    @Setter
    private LocalDate DateCommande;
}
