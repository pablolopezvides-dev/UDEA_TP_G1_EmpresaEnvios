package servicios;

import modelos.Envio;
import java.util.List;

public interface IEnvioServicio {
    boolean agregarEnvio(Envio envio); // false si el código ya existe
    boolean retirarEnvio(String codigo);
    List<Envio> obtenerTodos();
    boolean existeCodigo(String codigo);
}