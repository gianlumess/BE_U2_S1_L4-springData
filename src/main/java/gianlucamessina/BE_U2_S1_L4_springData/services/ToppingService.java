package gianlucamessina.BE_U2_S1_L4_springData.services;

import gianlucamessina.BE_U2_S1_L4_springData.entities.Topping;
import gianlucamessina.BE_U2_S1_L4_springData.repositories.ToppingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToppingService {

    @Autowired
    private ToppingRepository toppingRepository;

    public void saveTopping(Topping newTopping) {
        toppingRepository.save(newTopping);
        System.out.println("Nuovo Topping " + newTopping.getNome() + " salvato con successo!");
    }
}
