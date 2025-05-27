package io.github.enzopavani.productsapi.repository;

import io.github.enzopavani.productsapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {
}
