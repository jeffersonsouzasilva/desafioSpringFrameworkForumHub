package br.com.forumhub.api.dto.topico;

import br.com.forumhub.api.models.entities.Resposta;
import br.com.forumhub.api.models.entities.Topico;
import br.com.forumhub.api.models.status.Status;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;
import java.util.List;

public record DetalhesTopicoDto(
        Long id,
        String titulo,
        String mensagem,
        @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
        LocalDateTime dataCriacao,
        Status status,
        String autor,
        String curso
//        List<Resposta> respostas
) {
    public DetalhesTopicoDto(Topico topico) {
        this(
                topico.getId(),
                topico.getTitulo(),
                topico.getMensagem(),
                topico.getDataCriacao(),
                topico.getStatus(),
                topico.getAutor().getNome(),
                topico.getCurso()
//                topico.getRespostas()
        );
    }
}
