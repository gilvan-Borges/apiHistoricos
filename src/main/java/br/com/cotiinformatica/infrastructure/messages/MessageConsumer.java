package br.com.cotiinformatica.infrastructure.messages;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import com.fasterxml.jackson.databind.ObjectMapper;
import br.com.cotiinformatica.domain.models.entities.Historico;
import br.com.cotiinformatica.infrastructure.repositories.HistoricoRepository;

@Component
public class MessageConsumer {
	@Autowired
	HistoricoRepository historicoRepository;
	@Autowired
	ObjectMapper objectMapper;

	@RabbitListener(queues = "historico_produtos")
	public void receive(@Payload String payload) {

		try {

			// deserializar o json que contem os dados lidos da fila
			var historico = objectMapper.readValue(payload, Historico.class);

			// gravando no banco de dados do mongodb
			historicoRepository.save(historico);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
