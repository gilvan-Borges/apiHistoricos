package br.com.cotiinformatica.infrastructure.repositories;

import java.util.UUID;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import br.com.cotiinformatica.domain.models.entities.Historico;

@Repository
public interface HistoricoRepository extends MongoRepository<Historico, UUID> {
}
