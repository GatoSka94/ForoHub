package com.GatoSka94.ForoHub.Domain.Topico;

import com.GatoSka94.ForoHub.Domain.Curso.NombreCurso;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroTopico(
        @NotBlank String titulo,
        @NotBlank String mensaje,
        @NotBlank String autor,
        @NotNull NombreCurso nombreCurso) {
}