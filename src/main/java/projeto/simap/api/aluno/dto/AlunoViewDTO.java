package projeto.simap.api.aluno.dto;

public record AlunoViewDTO(
        String nomeEscola,
        String nomeAluno,
        String serieTurma,
        String ra,
        String dataNascimento,
        String declaracao,
        String anoLetivo,
        String hipoteseB1,
        String frequenciaB1,
        String praB1,
        String hipoteseB2,
        String frequenciaB2,
        String praB2,
        String hipoteseB3,
        String frequenciaB3,
        String praB3,
        String hipoteseB4,
        String frequenciaB4,
        String praB4
) {}
