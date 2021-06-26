package group.demo.CompleteOrder;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CompleteOrderRepository extends JpaRepository<CompleteOrderModel,Long> {

    @Query("SELECT s FROM CompleteOrderModel s WHERE s.name = ?1")
    Optional<CompleteOrderModel> findCompleteOrderModelByName(String name);
}
