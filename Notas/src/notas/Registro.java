package notas;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Registro {

    private String disciplina;
    public double notaa;
    private double notab;
    private double trabalho;
    private double media;

    public Registro(String disciplina, double notaa, double notab, double trabalho, double media) {
        this.disciplina = disciplina;
        this.notaa = notaa;
        this.notab = notab;
        this.trabalho = trabalho;

    }

    public Registro() {
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public double getNotaa() {
        return notaa;
    }

    public void setNotaa(double notaa) {
        this.notaa = notaa;
    }

    public double getNotab() {
        return notab;
    }

    public void setNotab(double notab) {
        this.notab = notab;
    }

    public double getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(double trabalho) {
        this.trabalho = trabalho;
    }

    public void exibirNota() {

        media = notaa + notab + trabalho / 3;
        DecimalFormat fmt = new DecimalFormat("#0.00");
        if (media >= 7) {
            String text = "";
            text = text + "\nDisciplina: " + disciplina;
            text = text + "\nNota 1: " + notaa;
            text = text + "\nNota 2: " + notab;
            text = text + "\nTrabalho: " + trabalho;
            text = text + "\nMedia : " + fmt.format(media);
            JOptionPane.showMessageDialog(null, "Aprovado" + text);
        } else {
            String text = "";
            text = text + "\nDisciplina: " + disciplina;
            text = text + "\nNota 1: " + notaa;
            text = text + "\nNota 2: " + notab;
            text = text + "\nTrabalho: " + trabalho;
            text = text + "\nMedia : " + fmt.format(media);
            JOptionPane.showMessageDialog(null, "Reprovado" + text);
        }

    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

}
