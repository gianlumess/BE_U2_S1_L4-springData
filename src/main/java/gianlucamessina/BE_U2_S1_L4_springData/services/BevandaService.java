package gianlucamessina.BE_U2_S1_L4_springData.services;

import gianlucamessina.BE_U2_S1_L4_springData.entities.Bevanda;
import gianlucamessina.BE_U2_S1_L4_springData.exceptions.ValidationException;
import gianlucamessina.BE_U2_S1_L4_springData.repositories.BevandaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BevandaService {


    @Autowired
    private BevandaRepository bevandaRepository;

    public void saveDrink(Bevanda newDrink) {
        if (bevandaRepository.existsByNome(newDrink.getNome()))
            throw new ValidationException("La bevanda " + newDrink.getNome() + " esiste già!");

        bevandaRepository.save(newDrink);
        System.out.println("Nuova bevanda " + newDrink.getNome() + " salvata con successo!");
    }
}
