public class ConvidadoRH {
    private String Nome;
    private String cpf;
    private String telefone;
    private String dataNascimento;
    private String dataAgendamento;
    private String periodo;


    public String getNome() {
        return Nome;
    }



    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getDataAgendamento() {
        return dataAgendamento;
    }

    public void setDataAgendamento(String dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public ConvidadoRH(String nome, String cpf, String telefone, String dataNascimento, String dataAgendamento, String periodo) {
        Nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.dataAgendamento = dataAgendamento;
        this.periodo = periodo;
    }
    @Override
    public String toString() {
        return "convidadoRH{" +
                "Nome='" + Nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", telefone='" + telefone + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", dataAgendamento='" + dataAgendamento + '\'' +
                ", periodo='" + periodo + '\'' +
                '}';
    }
}
