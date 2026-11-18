package ra.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.model.Destino;
import ra.repository.DestinoRepository;

@Service
public class DestinoService {

    @Autowired
    private DestinoRepository repository;

    public List<Destino> listarTodos() {
        return repository.findAll();
    }

    public Destino buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Destino salvar(Destino destino) {
        return repository.save(destino);
    }

    public Destino atualizar(Long id, Destino dadosAtualizados) {
        Destino existente = buscarPorId(id);
        if (existente == null) {
            return null;
        }
        existente.setCidade(dadosAtualizados.getCidade());
        existente.setEstado(dadosAtualizados.getEstado());
        existente.setPais(dadosAtualizados.getPais());
        existente.setDescricao(dadosAtualizados.getDescricao());
        return repository.save(existente);
    }

    public boolean deletar(Long id) {
        if (!repository.existsById(id)) {
            return false;
        }
        repository.deleteById(id);
        return true;
    }
}