package br.com.cotiinformatica.domain.models.entities;

import java.util.Date;
import java.util.UUID;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Data
@Document(collection = "Historicos")
public class Historico {
	@Id
	private UUID id;
	private Date dataHora;
	private TipoAcao acao;
	private Produto produto;

	public enum TipoAcao {
		CADASTRO,
		EDICAO,
		EXCLUSAO
	}
}
