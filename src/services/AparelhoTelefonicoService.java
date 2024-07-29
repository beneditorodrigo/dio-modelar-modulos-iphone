package services;

import interfaces.AparelhoTelefonicoLocalRemote;

public class AparelhoTelefonicoService implements AparelhoTelefonicoLocalRemote {
    @Override
    public boolean ligar() {
        return false;
    }

    @Override
    public boolean atender() {
        return false;
    }

    @Override
    public void iniciarCorreioVoz() {

    }
}
