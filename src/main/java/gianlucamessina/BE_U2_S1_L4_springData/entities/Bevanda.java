package gianlucamessina.BE_U2_S1_L4_springData.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "bevande")
@Getter
@Setter
public class Bevanda extends Alimento {
    private double quantita;


    public Bevanda() {
    }

    public Bevanda(String nome, int calorie, double prezzo, double quantita) {
        super(nome, calorie, prezzo);
        this.quantita = quantita;
    }

    @Override
    public String toString() {
        return "Bevanda{" +
                "nome='" + nome + '\'' +
                ", quantita=" + quantita +
                ", calorie=" + calorie +
                ", prezzo=" + prezzo +
                '}';
    }
}
