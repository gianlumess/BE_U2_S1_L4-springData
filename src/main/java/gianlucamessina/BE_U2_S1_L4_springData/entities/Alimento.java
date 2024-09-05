package gianlucamessina.BE_U2_S1_L4_springData.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Alimento {
    protected String nome;
    protected int calorie;
    protected double prezzo;
    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private UUID id;

    public Alimento(String nome, int calorie, double prezzo) {
    }


}
