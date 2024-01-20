package ayiacademy.tp1.ejercicio1.persistence.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "servicios")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Servicio implements Serializable {
    @Id
    private int idServicio;

    private String codigoEan;
    private String nombre;
    private String descripcion;
    private float precio;
    private int duracion;

    @Serial
    private static final long serialVersionUID = 1L;
}
