package Controle_de_Fluxo.DesafioControleFluxo;

/**
 * A classe ParametrosInvalidosException representa uma exceção personalizada
 * que é lançada quando o segundo parâmetro é menor ou igual ao primeiro.
 */
public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}
