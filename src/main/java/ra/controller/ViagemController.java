package ra.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import ra.model.Viagem;
import ra.service.ViagemService;

@RestController
@RequestMapping("/api/viagens")
@Tag(name = "Viagens", description = "Gerenciamento de reservas de viagens")
public class ViagemController {

    @Autowired
    private ViagemService service;

    @GetMapping
    @Operation(summary = "Listar todas as viagens")
    public List<Viagem> listar() {
        return service.listarTodas();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Buscar viagem por ID")
    public ResponseEntity<Viagem> buscarPorId(@PathVariable Long id) {
        Viagem viagem = service.buscarPorId(id);
        return viagem != null ? ResponseEntity.ok(viagem) : ResponseEntity.notFound().build();
    }

    @PostMapping
    @Operation(summary = "Cadastrar uma nova viagem associando passageiro e destino")
    public ResponseEntity<Viagem> salvar(@RequestBody Viagem viagem) {
        Viagem criada = service.salvar(viagem);
        return criada != null ? ResponseEntity.ok(criada) : ResponseEntity.badRequest().build();
    }

    @PutMapping("/{id}")
    @Operation(summary = "Atualizar uma viagem existente")
    public ResponseEntity<Viagem> atualizar(@PathVariable Long id, @RequestBody Viagem dados) {
        Viagem atualizada = service.atualizar(id, dados);
        return atualizada != null ? ResponseEntity.ok(atualizada) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Cancelar/remover uma viagem")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        return service.deletar(id) ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
}