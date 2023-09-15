package interfaces;

public interface ClienteInterface {
	String getNome();
    String getEndereco();
    String getEmail();
    String getTelefone();
    String getCpf();
    
    void setNome(String nome);
    
    void setEndereco(String endereco);
    
    void setEmail(String email);
    
    void setTelefone(String telefone);
    
    void setCpf(String cpf);
    
    void visualizar();
    

}
