package academia;

import javax.swing.JOptionPane;

public class Alunos {
    
    private String nome;
    private int idade;
    private String sexo;
    private String especial;
    

    public Alunos(String nome, int idade, String sexo, String especial) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.especial = especial;
    }

    public Alunos() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEspecial() {
        return especial;
    }

    public void setEspecial(String especial) {
        this.especial = especial;
    }
    
    public void exibirAluno(){
        String text = "";
        text = text + "\nNome: " + nome;
        text = text + "\nIdade: " + idade;
        text = text + "\nSexo: " + sexo;
        text = text + "\nEspecial: " + especial;
        JOptionPane.showMessageDialog(null, text);
        
    }
    
    

}
