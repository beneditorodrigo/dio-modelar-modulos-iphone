package services;

import entities.Musica;
import interfaces.ReprodutorMusicalLocalRemote;

import java.util.List;

public class ReprodutorMusicalService implements ReprodutorMusicalLocalRemote {
    @Override
    public boolean tocar() {
        return false;
    }

    @Override
    public boolean pausar() {
        return false;
    }

    @Override
    public List<Musica> selecionarMusicas() {
        return null;
    }
}
