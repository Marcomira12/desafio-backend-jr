package desafio.autoscare.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import desafio.autoscare.models.Veiculo;
@Service
public class VeiculoConsultaService {
	private final RestClient restClient = RestClient.create();
	private String apiExterna="https://my.api.mockaroo.com/veiculos?key=55ad1cd0&placa={placa}";
	public Veiculo consultarVeiculo(String placa) {
		
		return restClient.get()
                .uri(apiExterna,placa)
                .retrieve()
                .body(Veiculo.class);
		
	}
}
