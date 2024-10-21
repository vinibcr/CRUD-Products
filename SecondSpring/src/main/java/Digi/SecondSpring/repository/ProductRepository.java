
package Digi.SecondSpring.repository;

import Digi.SecondSpring.model.Product;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {

    // NEW: Buscar produtos por intervalo de preço
    List<Product> findByPriceBetween(double minPrice, double maxPrice);
}
