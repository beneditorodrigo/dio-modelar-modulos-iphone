package interfaces;

import entities.Musica;

import java.util.List;

public interface ReprodutorMusicalLocalRemote {
    boolean tocar();
    boolean pausar();
    List<Musica> selecionarMusicas();
}
