package model;

import java.util.ArrayList;

public class ArrayAluno implements Interface{
    private ArrayList<Aluno> aluno = new ArrayList<Aluno>();
    

    
    //metodos
    @Override
    public boolean inserir(Aluno p){
        boolean verifica = false;
        
        aluno.add(p);

        if(aluno.size() >= 1){
            verifica = true;
        }
        
        return verifica;
    }

    @Override
    public Aluno seleciona(String rgm) {
        Aluno a1 = null;
        
        for(int i = 0; i < aluno.size(); i++){
            if(aluno.get(i).getRgm().equalsIgnoreCase(rgm)){
                a1 = aluno.get(i);
            }
        }
        
        return a1;
    }

    @Override
    public ArrayList<Aluno> selecionaTodos() {
        return aluno;
    }
    
}
