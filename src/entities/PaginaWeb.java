package entities;

public class PaginaWeb {
    private Byte[] cabecalho;
    private Byte[] conteudo;
    private String url;

    public Byte[] getCabecalho() {
        return cabecalho;
    }

    public void setCabecalho(Byte[] cabecalho) {
        this.cabecalho = cabecalho;
    }

    public Byte[] getConteudo() {
        return conteudo;
    }

    public void setConteudo(Byte[] conteudo) {
        this.conteudo = conteudo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
