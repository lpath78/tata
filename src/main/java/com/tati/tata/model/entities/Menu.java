package com.tati.tata.model.entities;

import com.tati.tata.model.references.TypeMenu;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Table(name = "MENU")
@SuppressWarnings("serial")
public class Menu extends AbstractEntityGeneral{
    @Getter
    @Setter
    @Enumerated(EnumType.STRING)
    private TypeMenu typeMenu;
    @Getter
    @Setter
    @OneToOne(cascade = CascadeType.MERGE)
    private Burger burger;
    @Getter
    @Setter
    @OneToOne(cascade = CascadeType.MERGE)
    private Soda soda;
    @Getter
    @Setter
    @OneToOne(cascade = CascadeType.MERGE)
    private Accompagnement accompagnement;
    @Getter
    @Setter
    @OneToOne(cascade = CascadeType.MERGE)
    private Sauce sauce;

}
