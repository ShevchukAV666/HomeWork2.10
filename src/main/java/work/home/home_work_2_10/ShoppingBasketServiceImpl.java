package work.home.home_work_2_10;


import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@SessionScope
public class ShoppingBasketServiceImpl implements ShoppingBasketService {

    List<Integer> product = new ArrayList<>();

    public void addProduct(Integer idProduct[]) {
        product.addAll(Arrays.asList(idProduct));
    }

    public List<Integer> getProduct() {
        return product;
    }
}

