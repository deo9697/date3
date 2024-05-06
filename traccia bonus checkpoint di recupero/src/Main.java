/*Classe MaterialeDidattico e Biblioteca:**
        - Crea una classe `MaterialeDidattico` con attributi titolo, autore e tipo (libro, slide, video, ecc.).
        - Crea una classe `Biblioteca` che rappresenta una biblioteca universitaria, con attributi nome, elenco dei materiali didattici disponibili e numero di copie disponibili per ogni materiale.
 - Implementa un metodo per prenotare un materiale didattico e un metodo per aggiungere una nuova copia di un materiale alla biblioteca.
 - Utilizza la classe e la funzione nel main*/


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MaterialeDidattico libro1 = new MaterialeDidattico("i promessi sposi", "Alex Manzoni","romanzo");
        MaterialeDidattico libro2 = new MaterialeDidattico("Rosso Malpelo" , "Jhonny Verga" , "Novella");

        List<MaterialeDidattico> materiali = new ArrayList<>();
        List<Integer> copie = new ArrayList<>();

        Biblioteca biblioteca = new Biblioteca("UNICAL", materiali , copie);

        biblioteca.aggiungiMateriale(libro1,5);
        biblioteca.aggiungiMateriale(libro2 , 5);

        //prova prenotazione

        biblioteca.prenotaMateriale(0);
        biblioteca.prenotaMateriale(2);
        biblioteca.prenotaMateriale(1);

        for (int i = 0; i <biblioteca.getMaterialiDisponibili().size(); i++) {
            MaterialeDidattico materiale = biblioteca.getMaterialiDisponibili().get(i);
            int copieDisponibili = biblioteca.getCopieDisponibili().get(i);
            System.out.println("Materiale: " + materiale.getTitolo() + ", Copie disponibili: " + copieDisponibili);

    }
}
}