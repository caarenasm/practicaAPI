package practica.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import practica.backend.Dto.EmpleadoDto;
import practica.backend.Dto.RequestDto;
import practica.backend.Dto.RespuestaDto;
import practica.backend.service.IEmpleadoService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("empleado")
public class EmpleadoController {

    @Autowired
    private IEmpleadoService iEmpleadoService;


    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<EmpleadoDto>> listaEmpleados() {

        return new ResponseEntity<>(iEmpleadoService.listaEmpleado(), HttpStatus.OK);
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RespuestaDto> crearEmpleados(@RequestBody RequestDto request) {

        return new ResponseEntity<>(iEmpleadoService.crearEmpleado(request), HttpStatus.OK);
    }

    @PatchMapping(path = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RespuestaDto> editarEmpleados(@RequestBody RequestDto request) throws Exception {

        return new ResponseEntity<>(iEmpleadoService.editarEmpleado(request), HttpStatus.OK);
    }

    @DeleteMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RespuestaDto> eliminarEmpleados(@RequestBody RequestDto request) throws Exception {

        return new ResponseEntity<>(iEmpleadoService.eliminarEmpleado(request), HttpStatus.OK);
    }
}
