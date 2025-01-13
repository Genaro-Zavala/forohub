package alura.forohub.domain.Topico;

import java.time.LocalDateTime;

public record DatosRespuestaTopico(
        Long id,
        String titulo,
        String mensaje,
        String curso,
        Boolean status,
        String autor,
        LocalDateTime fecha_Creacion

) {
}
