
package Digi.SecondSpring.repository;

import Digi.SecondSpring.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
