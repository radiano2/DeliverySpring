package group.demo.CompleteOrder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Optional;

@Service
public class CompleteOrderService {

    private final CompleteOrderRepository completeOrderRepository;

    @Autowired
    public CompleteOrderService(CompleteOrderRepository completeOrderRepository) {
        this.completeOrderRepository = completeOrderRepository;
    }

    public List<CompleteOrderModel> getCompleteOrders(){
        return completeOrderRepository.findAll();
    }

    @PostMapping
    public void addNewCompleteOrder(CompleteOrderModel completeOrderModel) {
        Optional<CompleteOrderModel> completeOrderModelOptional = completeOrderRepository.
                findCompleteOrderModelByName(completeOrderModel.getName());

        completeOrderRepository.save(completeOrderModel);
    }

    public void deleteCompleteOrder(Long completeOrderId) {
        boolean exists = completeOrderRepository.existsById(completeOrderId);
        if (!exists) {
            throw new IllegalStateException("student with id " + completeOrderId + " does not exists");
        }
        completeOrderRepository.deleteById(completeOrderId);
    }
}
