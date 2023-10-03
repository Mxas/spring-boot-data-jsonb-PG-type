package eu.mxas.datademo.springbootdatajsonbPGtype.persistence;

import eu.mxas.datademo.springbootdatajsonbPGtype.persistence.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
