import java.util.List;

public class Biblioteca {

    private String nome;
    private List<MaterialeDidattico> materialiDisponibili;
    private List<Integer> copieDisponibili;

    public Biblioteca(String nome, List<MaterialeDidattico> materialiDisponibili, List<Integer> copieDisponibili) {
        this.nome = nome;
        this.materialiDisponibili = materialiDisponibili;
        this.copieDisponibili = copieDisponibili;
    }

    public void aggiungiMateriale(MaterialeDidattico materiale , int copie){
        materialiDisponibili.add(materiale);
        copieDisponibili.add(copie);
    }

    public void prenotaMateriale( int i){
        if (i >= 0 && i < materialiDisponibili.size()) {
            int copie = copieDisponibili.get(i);
            if (copie > 0) {
                copieDisponibili.set(i, copie - 1);
                System.out.println("Materiale prenotato con successo!");
            } else {
                System.out.println("Spiacenti, non ci sono copie disponibili di questo materiale.");
            }
        } else {
            System.out.println("Indice non valido.");
        }
    }

    public List<MaterialeDidattico> getMaterialiDisponibili() {
        return materialiDisponibili;
    }

    public List<Integer> getCopieDisponibili() {
        return copieDisponibili;
    }
}