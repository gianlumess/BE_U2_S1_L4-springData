package gianlucamessina.BE_U2_S1_L4_springData.repositories;

import gianlucamessina.BE_U2_S1_L4_springData.entities.Topping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ToppingRepository extends JpaRepository<Topping, UUID> {
}
