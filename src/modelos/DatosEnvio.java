package modelos;

public class DatosEnvio {
    private final String codigo;
    private final String cliente;
    private final double peso;
    private final double distancia;

    public DatosEnvio(String codigo, String cliente, double peso, double distancia) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.peso = peso;
        this.distancia = distancia;
    }

    public String getCodigo() { return codigo; }
    public String getCliente() { return cliente; }
    public double getPeso() { return peso; }
    public double getDistancia() { return distancia; }
}
