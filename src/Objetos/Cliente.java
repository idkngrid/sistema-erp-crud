package Objetos;

public class Cliente {
    //ATRIBUTOS
    private String nomeCliente = "";
    private String cpfCliente = "";
    private String emailCliente = "";
    private String telefoneCliente = "";

    //GET e SET
    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }
  

    //MÉTODOS
    public void limpaCliente(){
       nomeCliente = "";
       cpfCliente = "";
       emailCliente = "";
       telefoneCliente = "";
    }
}
