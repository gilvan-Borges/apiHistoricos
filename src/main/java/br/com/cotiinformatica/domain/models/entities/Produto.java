package br.com.cotiinformatica.domain.models.entities;

import java.util.UUID;
import lombok.Data;

@Data
public class Produto {
	
	private UUID id;
	private String nome;
	private Double preco;
	private Integer quantidade;
	private Double total;
	private String categoria;
}
