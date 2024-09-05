package gianlucamessina.BE_U2_S1_L4_springData.repositories;

import gianlucamessina.BE_U2_S1_L4_springData.entities.Alimento;
import gianlucamessina.BE_U2_S1_L4_springData.entities.Bevanda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface AlimentoRepository extends JpaRepository<Alimento, UUID> {

    boolean existsByNome(String nome);

    //****************************** CUSTOM QUERIES *************************************
    @Query("SELECT b FROM Bevanda b WHERE b.calorie = 0")
    List<Bevanda> filterBevande0Calories();

    //****************************** DERIVED QUERIES *************************************
    List<Bevanda> findByQuantita(double quantita);

}
