package ra.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.model.Passageiro;
import ra.repository.PassageiroRepository;

@Service
public class PassageiroService {

    @Autowired
    private PassageiroRepository repository;

    public List<Passageiro> listarTodos() {
        return repository.findAll();
    }

    public Passageiro buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Passageiro salvar(Passageiro passageiro) {
        return repository.save(passageiro);
    }

    public Passageiro atualizar(Long id, Passageiro dadosAtualizados) {
        Passageiro existente = buscarPorId(id);
        if (existente == null) {
            return null;
        }
        existente.setNome(dadosAtualizados.getNome());
        existente.setCpf(dadosAtualizados.getCpf());
        existente.setEmail(dadosAtualizados.getEmail());
        existente.setTelefone(dadosAtualizados.getTelefone());
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