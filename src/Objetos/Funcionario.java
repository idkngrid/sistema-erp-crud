package Objetos;

public class Funcionario {
    //ATRIBUTOS
    private String nomeFuncionario = "";
    private String cpfFuncionario = "";
    private String telefoneFuncionario = "";
    private String cargoFuncionario = "";

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getCpfFuncionario() {
        return cpfFuncionario;
    }

    public void setCpfFuncionario(String cpfFuncionario) {
        this.cpfFuncionario = cpfFuncionario;
    }

    public String getTelefoneFuncionario() {
        return telefoneFuncionario;
    }

    public void setTelefoneFuncionario(String telefoneFuncionario) {
        this.telefoneFuncionario = telefoneFuncionario;
    }

    public String getCargoFuncionario() {
        return cargoFuncionario;
    }

    public void setCargoFuncionario(String cargoFuncionario) {
        this.cargoFuncionario = cargoFuncionario;
    }
    
    //MÉTODOS
    public void limpaFuncionario(){
       nomeFuncionario = "";
       cpfFuncionario = "";
       telefoneFuncionario = "";
       cargoFuncionario = "";
    }
}


