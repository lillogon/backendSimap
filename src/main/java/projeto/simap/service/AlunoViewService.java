package projeto.simap.service;

import java.util.List;

import org.springframework.stereotype.Service;

import projeto.simap.api.aluno.dto.AlunoViewDTO;
import projeto.simap.readmodel.AlunoViewJdbcRepository;

@Service
public class AlunoViewService {

    private final AlunoViewJdbcRepository repo;

    public AlunoViewService(AlunoViewJdbcRepository repo) {
        this.repo = repo;
    }

    public List<AlunoViewDTO> listar() {
        return repo.listar();
    }
}