package br.unisul.pweb.jlc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import br.unisul.pweb.jlc.domain.Cliente;
import br.unisul.pweb.jlc.domain.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

	
	@Transactional(readOnly = true)
	List<Pedido> findByCliente (Cliente cliente);
}
