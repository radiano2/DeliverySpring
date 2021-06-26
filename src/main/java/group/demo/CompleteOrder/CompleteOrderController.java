package group.demo.CompleteOrder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/1.0/completeorders")
public class CompleteOrderController {

    private final CompleteOrderService completeOrderService;

    @Autowired
    public CompleteOrderController(CompleteOrderService completeOrderService) {
        this.completeOrderService = completeOrderService;
    }

    @GetMapping
    public List<CompleteOrderModel> getCompleteOrders(){
        return completeOrderService.getCompleteOrders();
    }

    @PostMapping
    public void registerNewCompleteOrder(@RequestBody CompleteOrderModel completeOrderModel){
        completeOrderService.addNewCompleteOrder(completeOrderModel);
    }

    @DeleteMapping(path = "{completeOrderId}")
    public void deleteCompleteOrder(@PathVariable("completeOrderId") Long completeOrderId){
        completeOrderService.deleteCompleteOrder(completeOrderId);
    }
}
