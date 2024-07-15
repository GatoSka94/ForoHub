package com.GatoSka94.ForoHub.Domain.Topico;

import com.GatoSka94.ForoHub.Domain.Curso.NombreCurso;
import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopico(
        @NotNull Long id,
        String mensaje,
        String titulo,
        NombreCurso nombreCurso
) {
}