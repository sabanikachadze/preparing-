package Projects;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;


import static org.junit.jupiter.api.Assertions.*;

class InMemoryRepositoryTest {

    private InMemoryRepository<Product, String> testRepository;

    @BeforeEach
    void load() {
        testRepository = new InMemoryRepository<>(Product::id);
    }


    @Test
    void missingIdReturnsEmpty() {
        Product product = new Product("5", "saba", 55);

        testRepository.save(product);
        Optional<Product> unableProduct = testRepository.findById("1");

        assertTrue(unableProduct.isEmpty());
    }

    @Test
    void sameIdShouldReplacePrevious() {
        Product product1 = new Product("5", "saba", 55);
        Product product2 = new Product("5", "updated", 99);

        testRepository.save(product1);
        testRepository.save(product2);

        Product result = testRepository.findById("5").orElseThrow();

        assertEquals(product2, result);
        assertEquals(1, testRepository.findAll().size());
    }

    @Test
    void changingTheFindAllShouldAffectRepository() {
        Product product1 = new Product("5", "saba", 55);
        Product product2 = new Product("6", "vaska", 60);

        testRepository.save(product1);
        testRepository.save(product2);

        List<Product> products = testRepository.findAll();
        products.remove(1);

        assertNotEquals(testRepository.findAll().size(), products.size());
    }

    @Test
    void findAllOrderMustReturnCorrectOrderedList() {
        Product product1 = new Product("5", "saba", 55);
        Product product2 = new Product("6", "vaska", 60);
        Product product3 = new Product("7", "don", 65);

        testRepository.save(product1);
        testRepository.save(product2);
        testRepository.save(product3);

        List<Product> sortedList = testRepository.findAll(Comparator.comparingDouble(Product::price));

        assertEquals(product1, sortedList.get(0));
        assertEquals(product2, sortedList.get(1));
        assertEquals(product3, sortedList.get(2));

    }
}