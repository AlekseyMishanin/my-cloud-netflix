package ru.mishanin.eureka.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.mishanin.common.dto.ProductDto;

import java.util.List;

@Controller
public class ProductsFeignController {

    private ProductsInterfaceClient productsInterfaceClient;

    @Autowired
    public void setProductsInterfaceClient(ProductsInterfaceClient productsInterfaceClient) {
        this.productsInterfaceClient = productsInterfaceClient;
    }

    @RequestMapping("/get-products")
    public String greeting(Model model) {
        List<ProductDto> dtoList= productsInterfaceClient.productDtos();
        model.addAttribute("products", dtoList);
        return "index";
    }
}
