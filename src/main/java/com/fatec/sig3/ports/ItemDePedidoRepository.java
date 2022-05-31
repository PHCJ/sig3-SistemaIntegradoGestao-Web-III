package com.fatec.sig3.ports;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.fatec.sig3.model.ItemDePedido;

@Repository
public interface ItemDePedidoRepository extends JpaRepository<ItemDePedido, Long> {
}