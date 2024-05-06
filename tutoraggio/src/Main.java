/**Manipolazione Array di Decimali:**
        - Crea una classe `DoubleArray` con un attributo array di numeri decimali.
   - Implementa un metodo per calcolare e stampare la somma di tutti i numeri presenti nell'array.
        - Implementa un metodo per ordinare l'array in ordine crescente e stamparlo.
        - Utilizza la classe e la funzione nel main

**Traccia Bonus**
        **Classe MaterialeDidattico e Biblioteca:**
        - Crea una classe `MaterialeDidattico` con attributi titolo, autore e tipo (libro, slide, video, ecc.).
        - Crea una classe `Biblioteca` che rappresenta una biblioteca universitaria, con attributi nome, elenco dei materiali didattici disponibili e numero di copie disponibili per ogni materiale.
   - Implementa un metodo per prenotare un materiale didattico e un metodo per aggiungere una nuova copia di un materiale alla biblioteca.
   - Utilizza la classe e la funzione nel main*/

public class Main {
    public static void main(String[] args) {
        Double[] decimali = {1.5 , 2.7 , 3.1 , 4.5 , 5.8};
        DoubleArray array1 = new DoubleArray(decimali);


        System.out.println(array1.stampaNumeri());
        array1.ordinaNumeri();

    }
}
