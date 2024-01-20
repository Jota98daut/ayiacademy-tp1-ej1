package ayiacademy.tp1.ejercicio1.persistence.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "usuarios")
@Data
@NoArgsConstructor
public class Usuario implements Serializable {
    @Id
    @GeneratedValue
    private int idUsuario;

    private String nombre;
    private String passwordUsuario;

    public Usuario(String nombre, String passwordUsuario) {
        this.nombre = nombre;
        this.passwordUsuario = passwordUsuario;
    }

    @Serial
    private static final long serialVersionUID = 1L;
}
