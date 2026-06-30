package desafio.autoscare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import desafio.autoscare.models.Veiculo;
import desafio.autoscare.modelsDtos.ProprietarioDTO;
import desafio.autoscare.service.CadastrarVeiculoService;

@RestController
@RequestMapping("/veiculo")
public class CadastrarVeiculoController {
	@Autowired
	private CadastrarVeiculoService service;
	
	@PostMapping("/veiculo")
	public ResponseEntity<Object> cadastrarVeiculo(@RequestBody ProprietarioDTO obj){
		Veiculo veiculo=service.cadastrar(obj);
		return ResponseEntity.ok().body(veiculo);
	}

}
