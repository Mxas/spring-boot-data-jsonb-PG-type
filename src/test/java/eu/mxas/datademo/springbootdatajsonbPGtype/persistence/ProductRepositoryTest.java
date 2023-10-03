package eu.mxas.datademo.springbootdatajsonbPGtype.persistence;

import eu.mxas.datademo.springbootdatajsonbPGtype.persistence.entity.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProductRepositoryTest {

	@Autowired
	ProductRepository productRepository;

	@BeforeEach
	void setUp() {
	}

	@Test
	void insert(){
		var product = new Product();
		product.setName("Name 1");
		productRepository.save(product);
	}
}