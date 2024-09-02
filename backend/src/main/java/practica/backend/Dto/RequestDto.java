package practica.backend.Dto;

import lombok.Data;

@Data
public class RequestDto {
    private Long id;
    private String nombre;
    private String telefono;
    private String direccion;
    private Double salario;
}
