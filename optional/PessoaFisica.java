package interfaces;

public class PessoaFisica extends Cliente implements PessoaFisicaInterface {
	private String rg;

    public PessoaFisica(String nome, String endereco, String email, String telefone, String cpf, String rg) {
        super(nome, endereco, email, telefone, cpf);
        this.rg = rg;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("RG: " + getRg());
    }
}
