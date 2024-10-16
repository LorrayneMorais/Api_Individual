package com.api.exercicios.veiculo.controllers;

import org.springframework.web.bind.annotation.*;

import com.api.exercicios.veiculo.Veiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

    private List<Veiculo> veiculos = new ArrayList<>();

    // Método para adicionar um veículo
    @PostMapping("/adicionar")
    public Veiculo adicionarVeiculo(@RequestBody Veiculo veiculo) {
        veiculos.add(veiculo);
        return veiculo;
    }

    // Método para listar todos os veículos
    @GetMapping("/listar")
    public List<Veiculo> listarVeiculos() {
        return veiculos;
    }

    // Método para buscar um veículo por ID
    @GetMapping("/buscar/{id}")
    public Veiculo buscarVeiculo(@PathVariable Long id) {
        Optional<Veiculo> veiculo = veiculos.stream().filter(v -> v.getId().equals(id)).findFirst();
        return veiculo.orElse(null);
    }

    // Método para remover um veículo por ID
    @DeleteMapping("/remover/{id}")
    public String removerVeiculo(@PathVariable Long id) {
        veiculos.removeIf(v -> v.getId().equals(id));
        return "Veículo removido com sucesso!";
    }

    // Método para atualizar um veículo
    @PutMapping("/atualizar/{id}")
    public Veiculo atualizarVeiculo(@PathVariable Long id, @RequestBody Veiculo veiculoAtualizado) {
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getId().equals(id)) {
                veiculo.setMarca(veiculoAtualizado.getMarca());
                veiculo.setModelo(veiculoAtualizado.getModelo());
                return veiculo;
            }
        }
        return null;
    }
}
