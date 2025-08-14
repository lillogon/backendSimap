package projeto.simap.readmodel;

import java.util.List;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import projeto.simap.api.aluno.dto.AlunoViewDTO;

@Repository
public class AlunoViewJdbcRepository {

    private final NamedParameterJdbcTemplate jdbc;

    public AlunoViewJdbcRepository(NamedParameterJdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public List<AlunoViewDTO> listar() {
        String sql = """
            SELECT
              nome_escola     AS nomeEscola,
              nome_aluno      AS nomeAluno,
              serie_turma     AS serieTurma,
              ra,
              data_nascimento AS dataNascimento,
              declaracao,
              ano_letivo      AS anoLetivo,
              hipotese_b1     AS hipoteseB1,
              frequencia_b1   AS frequenciaB1,
              pra_b1          AS praB1,
              hipotese_b2     AS hipoteseB2,
              frequencia_b2   AS frequenciaB2,
              pra_b2          AS praB2,
              hipotese_b3     AS hipoteseB3,
              frequencia_b3   AS frequenciaB3,
              pra_b3          AS praB3,
              hipotese_b4     AS hipoteseB4,
              frequencia_b4   AS frequenciaB4,
              pra_b4          AS praB4
            FROM vw_simap_aluno
        """;

        return jdbc.getJdbcTemplate().query(sql, (rs, i) -> new AlunoViewDTO(
                rs.getString("nomeEscola"),
                rs.getString("nomeAluno"),
                rs.getString("serieTurma"),
                rs.getString("ra"),
                rs.getString("dataNascimento"),
                rs.getString("declaracao"),
                rs.getString("anoLetivo"),
                rs.getString("hipoteseB1"),
                rs.getString("frequenciaB1"),
                rs.getString("praB1"),
                rs.getString("hipoteseB2"),
                rs.getString("frequenciaB2"),
                rs.getString("praB2"),
                rs.getString("hipoteseB3"),
                rs.getString("frequenciaB3"),
                rs.getString("praB3"),
                rs.getString("hipoteseB4"),
                rs.getString("frequenciaB4"),
                rs.getString("praB4")
        ));
    }
}