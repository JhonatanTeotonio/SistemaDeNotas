package model;

import javax.swing.JOptionPane;

public class Aluno {
    private String rgm;
    private String nome;
    private float nota_parcial;
    private float nota_reg;

    public Aluno() {
    }

    public Aluno(String rgm, String nome, float nota_parc, float nota_reg) {
        this.rgm = rgm;
        this.nome = nome;
        this.nota_parcial = nota_parc;
        this.nota_reg = nota_reg;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNota_parcial(float nota_parcial) {
        this.nota_parcial = nota_parcial;
    }

    public float getNota_parcial() {
        return nota_parcial;
    }

    public void setNota_reg(float nota_reg) {
        this.nota_reg = nota_reg;
    }

    public float getNota_reg() {
        return nota_reg;
    }

    public void setRgm(String rgm) {
        this.rgm = rgm;
    }

    public String getRgm() {
        return rgm;
    }
    
    public void print(){
        JOptionPane.showMessageDialog(null, "RGM: " + rgm + "\nNome: " + nome + "\nNota Parcial: " + nota_parcial + "\nNota Regimental: " + nota_reg);
    }
}
