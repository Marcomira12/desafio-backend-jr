package desafio.autoscare.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import desafio.autoscare.models.Veiculo;
import desafio.autoscare.modelsDtos.ProprietarioDTO;
import desafio.autoscare.repository.VeiculoRepository;
import jakarta.transaction.Transactional;

@Service
public class CadastrarVeiculoService {
	@Autowired
	VeiculoRepository banco;
	@Autowired
	VeiculoConsultaService veiculoService;
	
	@Transactional
	public Veiculo cadastrar(ProprietarioDTO obj) {
		Veiculo veiculo=veiculoService.consultarVeiculo(obj.getPlaca());
		veiculo.setCpf(obj.getCpf());
		veiculo.setProprietario(obj.getProprietario());
		veiculo.setPlaca(obj.getPlaca());
		banco.save(veiculo);
		return veiculo;
		
	}
}
