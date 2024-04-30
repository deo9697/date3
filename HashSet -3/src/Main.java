/*Scrivere una funzione che restituisca un hashset riempito
Creare un oggeto dello stesso tipo inserito nell'HashSet e popolarlo
Scorrere il set, per ogni elemento verificare se è uguale all'oggetto creato ed eliminarlo
Svuotare l'hashset, verificarlo e stampare il risultato*/

/*mancano questi due punti Creare un oggeto dello stesso tipo inserito nell'HashSet e popolarlo Scorrere il set,
per ogni elemento verificare se è uguale all'oggetto creato ed eliminarlo
 */

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<MyObject> collezione = riempimentoHashSet();

        MyObject oggetto = new MyObject();
        oggetto.setName("Example");
        oggetto.setValue(10);

     //   hashSet.remove(oggetto);

        for(MyObject element: collezione) {
            if(element == oggetto)
                collezione.remove(element);
        }
        // Verifichiamo e stampiamo l'HashSet
        System.out.println("HashSet vuoto? " + collezione.isEmpty());  // Dovrebbe stampare "true"
    }

    // Funzione per riempire l'HashSet con oggetti di tipo MyObject
    public static HashSet<MyObject> riempimentoHashSet() {
        HashSet<MyObject> hashSet = new HashSet<>();

        // Aggiungiamo un po di oggetti all'HashSet
        MyObject oggetto1 = new MyObject();
        oggetto1.setName("Object 1");
        oggetto1.setValue(5);
        hashSet.add(oggetto1);

        MyObject oggetto2 = new MyObject();
        oggetto2.setName("Object 2");
        oggetto2.setValue(8);
        hashSet.add(oggetto2);

        MyObject oggetto3 = new MyObject();
        oggetto3.setName("Object 3");
        oggetto3.setValue(12);
        hashSet.add(oggetto3);

        // ora  creo un oggetto dello stesso tipo "Example" :
        MyObject oggetto4 = new MyObject();
        oggetto4.setName("Example");
        oggetto4.setValue(10);
        return hashSet;



    }
}
