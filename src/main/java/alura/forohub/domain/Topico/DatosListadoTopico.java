package alura.forohub.domain.Topico;

import java.time.LocalDateTime;

public record DatosListadoTopico(
        Long id,
        String titulo,
        String mensaje,
        String curso,
        Boolean status,
        String autor,
        LocalDateTime fecha_Creacion
) {

    public DatosListadoTopico(Topico topico){
        this(topico.getId(),topico.getTitulo(), topico.getMensaje(), topico.getCurso(), topico.getStatus(),
        topico.getAutor(), topico.getFecha_Creacion());
    }


}
