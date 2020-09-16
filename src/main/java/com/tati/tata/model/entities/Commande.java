package com.tati.tata.model.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Table(name = "COMMANDE")
@SuppressWarnings("serial")
public class Commande extends AbstractEntityGeneral{
    @Getter @Setter
    @OneToMany(cascade = CascadeType.MERGE)
    @JoinColumn(name = "ListeMenu")
    private List<Menu> toutLesMenus = new ArrayList<>();
    @Getter
    @Setter
    @OneToOne(cascade = CascadeType.MERGE)
    private Client client;
    @Getter
    @Setter
    private LocalDate DateCommande;
}
