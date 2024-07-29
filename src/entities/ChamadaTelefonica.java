package entities;

public class ChamadaTelefonica {
    private double duracao;
    private String numeroTelefone;
    private String numeroTelefoneContatado;

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public String getNumeroTelefoneContatado() {
        return numeroTelefoneContatado;
    }

    public void setNumeroTelefoneContatado(String numeroTelefoneContatado) {
        this.numeroTelefoneContatado = numeroTelefoneContatado;
    }
}
