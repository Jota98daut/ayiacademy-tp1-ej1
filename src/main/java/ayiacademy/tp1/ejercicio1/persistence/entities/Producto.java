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
@Table(name = "productos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Producto implements Serializable {
    @Id
    private int idProducto;

    private String codigoEan;
    private String nombre;
    private String descripcion;
    private float precio;
    private int stock;

    @Serial
    private static final long serialVersionUID = 1L;
}
