public class MaterialeDidattico {

    public String titolo;
    public String autore;
    public String tipo;

    public MaterialeDidattico(String titolo, String autore, String tipo) {
        this.titolo = titolo;
        this.autore = autore;
        this.tipo = tipo;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
