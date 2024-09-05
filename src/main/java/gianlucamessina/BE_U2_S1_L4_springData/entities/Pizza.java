package gianlucamessina.BE_U2_S1_L4_springData.entities;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Getter
@Entity
@Table(name = "pizze")
public class Pizza extends Alimento {
    @ManyToMany
    @JoinTable(name = "pizze_toppings", joinColumns = @JoinColumn(name = "pizze"), inverseJoinColumns = @JoinColumn(name = "toppings"))
    private List<Topping> toppingsList;


    public Pizza(String nome, List<Topping> toppings) {
        super(nome, 1104, 4.99);
        this.toppingsList = toppings;
        this.calorie = setCalories(toppings);
        this.prezzo = setPrice(toppings);
    }

    public Pizza() {
    }

    public double setPrice(List<Topping> toppings) {
        double tot = 4.99;
        if (toppings != null) {
            for (int i = 0; i < toppings.size(); i++) {
                tot += toppings.get(i).getPrezzo();
            }
        }
        return tot;
    }

    public int setCalories(List<Topping> toppings) {
        int totCal = 1104;
        if (toppings != null) {
            for (int i = 0; i < toppings.size(); i++) {
                totCal += toppings.get(i).getCalorie();
            }
        }
        return totCal;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "nome='" + nome + '\'' +
                ", toppings=" + toppingsList +
                ", calorie=" + calorie +
                ", prezzo=" + prezzo +
                '}';
    }
}
