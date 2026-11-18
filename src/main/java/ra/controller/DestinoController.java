package ra.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import ra.model.Destino;
import ra.service.DestinoService;

@RestController
@RequestMapping("/api/destinos")
@Tag(name = "Destinos", description = "Gerenciamento de destinos de viagem")
public class DestinoController {

    @Autowired
    private DestinoService service;

    @GetMapping
    @Operation(summary = "Listar todos os destinos")
    public List<Destino> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Buscar destino por ID")
    public ResponseEntity<Destino> buscarPorId(@PathVariable Long id) {
        Destino destino = service.buscarPorId(id);
        return destino != null ? ResponseEntity.ok(destino) : ResponseEntity.notFound().build();
    }

    @PostMapping
    @Operation(summary = "Cadastrar um novo destino")
    public Destino salvar(@RequestBody Destino destino) {
        return service.salvar(destino);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Atualizar dados de um destino")
    public ResponseEntity<Destino> atualizar(@PathVariable Long id, @RequestBody Destino dados) {
        Destino atualizado = service.atualizar(id, dados);
        return atualizado != null ? ResponseEntity.ok(atualizado) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Remover um destino")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        return service.deletar(id) ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
}