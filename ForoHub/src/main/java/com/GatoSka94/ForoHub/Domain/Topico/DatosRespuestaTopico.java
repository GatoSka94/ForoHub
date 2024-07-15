package com.GatoSka94.ForoHub.Domain.Topico;

import com.GatoSka94.ForoHub.Domain.Curso.NombreCurso;

public record DatosRespuestaTopico(Long id, String titulo, String mensaje, String fechaCrecacion,
                                   Boolean estadoActivo, String autor, NombreCurso nombreCurso) {
}