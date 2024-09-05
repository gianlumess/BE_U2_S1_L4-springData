package gianlucamessina.BE_U2_S1_L4_springData.services;

import gianlucamessina.BE_U2_S1_L4_springData.entities.Alimento;
import gianlucamessina.BE_U2_S1_L4_springData.entities.Bevanda;
import gianlucamessina.BE_U2_S1_L4_springData.exceptions.ValidationException;
import gianlucamessina.BE_U2_S1_L4_springData.repositories.AlimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlimentoService {
    @Autowired
    AlimentoRepository alimentoRepository;

    public void saveAlimento(Alimento alimento) {

        if (alimentoRepository.existsByNome(alimento.getNome()))
            throw new ValidationException("L'alimento " + alimento.getNome() + " è già stato salvato!");
        //Salvo l'utente
        alimentoRepository.save(alimento);

        // 5. Log di avvenuto salvataggio
        System.out.println("L'alimento " + alimento.getNome() + " è stato salvato con successo!");
    }

    public List<Bevanda> getBevande0Calories() {
        return alimentoRepository.filterBevande0Calories();
    }

    public List<Bevanda> findByQuantita(double quantita) {
        return alimentoRepository.findByQuantita(quantita);
    }
}
