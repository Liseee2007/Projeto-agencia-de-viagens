package ra.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.model.Destino;
import ra.model.Passageiro;
import ra.model.Viagem;
import ra.repository.DestinoRepository;
import ra.repository.PassageiroRepository;
import ra.repository.ViagemRepository;

@Service
public class ViagemService {

    @Autowired
    private ViagemRepository viagemRepository;

    @Autowired
    private PassageiroRepository passageiroRepository;

    @Autowired
    private DestinoRepository destinoRepository;

    public List<Viagem> listarTodas() {
        return viagemRepository.findAll();
    }

    public Viagem buscarPorId(Long id) {
        return viagemRepository.findById(id).orElse(null);
    }

    public Viagem salvar(Viagem viagem) {
        if (viagem.getPassageiro() == null || viagem.getPassageiro().getId() == null ||
            viagem.getDestino() == null || viagem.getDestino().getId() == null) {
            return null;
        }

        Passageiro passageiro = passageiroRepository.findById(viagem.getPassageiro().getId()).orElse(null);
        Destino destino = destinoRepository.findById(viagem.getDestino().getId()).orElse(null);

        if (passageiro == null || destino == null) {
            return null;
        }

        viagem.setPassageiro(passageiro);
        viagem.setDestino(destino);
        return viagemRepository.save(viagem);
    }

    public Viagem atualizar(Long id, Viagem dadosAtualizados) {
        Viagem existente = buscarPorId(id);
        if (existente == null) {
            return null;
        }

        existente.setDataIda(dadosAtualizados.getDataIda());
        existente.setDataVolta(dadosAtualizados.getDataVolta());
        existente.setValor(dadosAtualizados.getValor());
        existente.setStatus(dadosAtualizados.getStatus());

        if (dadosAtualizados.getPassageiro() != null && dadosAtualizados.getPassageiro().getId() != null) {
            Passageiro passageiro = passageiroRepository.findById(dadosAtualizados.getPassageiro().getId()).orElse(null);
            if (passageiro == null) {
                return null;
            }
            existente.setPassageiro(passageiro);
        }

        if (dadosAtualizados.getDestino() != null && dadosAtualizados.getDestino().getId() != null) {
            Destino destino = destinoRepository.findById(dadosAtualizados.getDestino().getId()).orElse(null);
            if (destino == null) {
                return null;
            }
            existente.setDestino(destino);
        }

        return viagemRepository.save(existente);
    }

    public boolean deletar(Long id) {
        if (!viagemRepository.existsById(id)) {
            return false;
        }
        viagemRepository.deleteById(id);
        return true;
    }
}