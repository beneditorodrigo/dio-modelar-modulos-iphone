package services;

import interfaces.NavegadorInternetLocalRemote;

public class NavegadorInternetService implements NavegadorInternetLocalRemote {
    @Override
    public boolean exibirPagina(String url) {
        return false;
    }

    @Override
    public void adicionarNovaAba() {

    }

    @Override
    public boolean atualizarPagina() {
        return false;
    }
}
