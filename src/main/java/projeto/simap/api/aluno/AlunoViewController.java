package projeto.simap.api.aluno;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import projeto.simap.api.aluno.dto.AlunoViewDTO;
import projeto.simap.service.AlunoViewService;

@RestController
@RequestMapping("/api/alunos")
public class AlunoViewController {

    private final AlunoViewService service;

    public AlunoViewController(AlunoViewService service) {
        this.service = service;
    }

    @GetMapping
    public List<AlunoViewDTO> listar() {
        return service.listar();
    }
}
