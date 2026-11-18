package ra.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import ra.model.Passageiro;
import ra.service.PassageiroService;


@RestController
@RequestMapping("/api/passageiros")
@Tag(name = "Passageiros", description = "Gerenciamento de passageiros")
public class PassageiroController {

    @Autowired
    private PassageiroService service;

    @GetMapping
    @Operation(summary = "Listar todos os passageiros")
    public List<Passageiro> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Buscar passageiro por ID")
    public ResponseEntity<Passageiro> buscarPorId(@PathVariable Long id) {
        Passageiro passageiro = service.buscarPorId(id);
        return passageiro != null ? ResponseEntity.ok(passageiro) : ResponseEntity.notFound().build();
    }

    @PostMapping
    @Operation(summary = "Cadastrar um novo passageiro")
    public Passageiro salvar(@RequestBody Passageiro passageiro) {
        return service.salvar(passageiro);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Atualizar dados de um passageiro")
    public ResponseEntity<Passageiro> atualizar(@PathVariable Long id, @RequestBody Passageiro dados) {
        Passageiro atualizado = service.atualizar(id, dados);
        return atualizado != null ? ResponseEntity.ok(atualizado) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Remover um passageiro")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        return service.deletar(id) ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
}