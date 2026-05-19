package complex_tasks.task_5;

import homework.complex_tasks.task_5.OutOfStockException;
import homework.complex_tasks.task_5.Product;
import homework.complex_tasks.task_5.ProductService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ProductServiceTest {
    /**
     * addProduct:
     * - positive- 1) add to new category; 2) add to existing category
     * - negative(flag -> false)
     * getProductByCategory:
     * -positive
     * -negative - no Category-> outOfStockException
     * filterProductsByPrice
     */
    private ProductService service;
    @BeforeEach
    public void setup(){
        service = new ProductService();
    }

    @Test
    void shouldAddProductToNewCategory(){
        Product product = new Product("Book1", 10.0, "Books");
        service.addProduct(product);
        List<Product> actual  = service.getProductByCategory("Books");

        assertEquals(1, actual.size());
        assertEquals(product, actual.getFirst());
    }

    @Test
    void shouldAddProductToExistingCategory(){
        Product product1 = new Product("Book2", 15.0, "Books");
        Product product2 = new Product("Book3", 112.0, "Books");
        Product product3 = new Product("Book4", 17.0, "Books");

        service.addProduct(product1);
        service.addProduct(product2);
        service.addProduct(product3);

        List<Product> actual  = service.getProductByCategory("Books");

        assertEquals(3, actual.size());
        assertEquals(product1, actual.get(0));
        assertEquals(product2, actual.get(1));
        assertEquals(product3, actual.get(2));
    }

    @Test
    void shouldNotAddProductWhenInventoryIsClosed(){
        service.setInventoryOpen(false);
        Product product = new Product("Book5", 15.0, "Books");
        service.addProduct(product);

        assertTrue(service.getInventory().isEmpty());
    }

    @Test
    void shouldGetProductByCategory(){
        Product product = new Product("Book5", 15.0, "Books");
        Product product2 = new Product("TV", 112.0, "Electronics");
        Product product3 = new Product("Handy", 17.0, "Electronics");
        service.addProduct(product);
        service.addProduct(product2);
        service.addProduct(product3);

        List<Product> actual  = service.getProductByCategory("Electronics");

        assertEquals(product2, actual.get(0));
        assertEquals(product3, actual.get(1));
    }

    @Test
    void shouldThrowOutOfStockExceptionWhenCategoryDoesNotExist(){
        assertThrows(
                OutOfStockException.class, ()-> service.getProductByCategory("Electronics")
        );
    }

    @Test
    void shouldFilterProductsByPrice(){
        Product product2 = new Product("TV", 112.0, "Electronics");
        Product product3 = new Product("Handy1", 170.0, "Electronics");
        Product product4= new Product("Handy2", 157.0, "Electronics");

        service.addProduct(product2);
        service.addProduct(product3);
        service.addProduct(product4);

        List<Product> actual  = service.shouldFilterProductsByPrice(160.00);
        assertEquals(2, actual.size());
        assertEquals(product2, actual.getFirst());
        assertEquals(product4, actual.get(1));

    }





}
