package work.home.home_work_2_10;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShoppingBasketController {

    private final ShoppingBasketService shoppingBasketService;

    public ShoppingBasketController(ShoppingBasketService shoppingBasketService) {
        this.shoppingBasketService = shoppingBasketService;
    }

    @GetMapping(path = "/store/order/add")
    public void addProduct(@RequestParam("idProduct") Integer idProduct[]) {
        shoppingBasketService.addProduct(idProduct);
    }

    @GetMapping(path = "/store/order/get")
    public List<Integer> getProduct() {
        return shoppingBasketService.getProduct();
    }

}
