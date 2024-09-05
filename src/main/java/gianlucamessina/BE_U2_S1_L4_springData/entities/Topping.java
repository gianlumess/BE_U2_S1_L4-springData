package gianlucamessina.BE_U2_S1_L4_springData.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;

@Getter
@Entity
@Table(name = "toppings")
public class Topping extends Alimento {

    public Topping(String nome, int calorie, double prezzo) {
        super(nome, calorie, prezzo);
    }

    public Topping() {
    }

    @Override
    public String toString() {
        return "Topping{" +
                "nome='" + nome + '\'' +
                ", calorie=" + calorie +
                ", prezzo=" + prezzo +
                '}';
    }
}
