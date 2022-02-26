package ru.geekbrains;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductsController {
    private ProductsService productsService;

    @Autowired
    public void setProductsService(ProductsService productsService) {
        this.productsService = productsService;
    }

    @RequestMapping("/showProducts")
    public String showProducts(Model uiModel) {
        uiModel.addAttribute("products", productsService.getAllProducts());
        return "show-products";
    }

    /*@RequestMapping("/showForm")
    public String showSimpleForm(Model uiModel) {
        Product product = new Product();
        product.setId(productsRepository.getNewId());
        uiModel.addAttribute("product", product);
        return "product-form";
    }


    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("product") Product product) {
        return "product-form-result";
    }*/

}
