package practica.backend.service;

import practica.backend.Dto.EmpleadoDto;
import practica.backend.Dto.RequestDto;
import practica.backend.Dto.RespuestaDto;

import java.util.List;

public interface IEmpleadoService {
    List<EmpleadoDto> listaEmpleado();
    RespuestaDto crearEmpleado(RequestDto request);
    RespuestaDto editarEmpleado(RequestDto request) throws Exception;
    RespuestaDto eliminarEmpleado(RequestDto request) throws Exception;
}
