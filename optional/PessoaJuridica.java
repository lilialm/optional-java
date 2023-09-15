package interfaces;

public class PessoaJuridica extends Cliente implements PessoaJuridicaInterface {
	private String cnpj;

    public PessoaJuridica(String nome, String endereco, String email, String telefone, String cpf, String cnpj) {
        super(nome, endereco, email, telefone, cpf);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("CNPJ: " + getCnpj());
    }
}
