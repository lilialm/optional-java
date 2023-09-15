package interfaces;

public interface PessoaJuridicaInterface extends ClienteInterface {
	String getCnpj();
    void setCnpj(String cnpj);
}
