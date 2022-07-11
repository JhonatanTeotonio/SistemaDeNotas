package model;

import java.util.ArrayList;

public interface Interface {
    public boolean inserir(Aluno p);
    public Aluno seleciona(String rgm);
    public ArrayList<Aluno> selecionaTodos();
}
