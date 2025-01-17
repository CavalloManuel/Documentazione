

/**
     *  La classe libro aiuta lo sviluppatore a gestire datidi tipo libro
     * @author CavalloManuel

    */


public class Libro {
    private String titolo;
    private int nPagine;
    private String autore;

/**
    *  Costruisce un oggetto libro dati in ingresso titolo, nPagine e autore
    * @param titolo Titolo Libro
    * @param nPagine Numero Pagine
    * @param autore Autore Libro
*/

    public Libro(String titolo, int nPagine, String autore) {
        this.titolo = titolo;
        this.nPagine = nPagine;
        this.autore = autore;
    }


    /**
     * Restituisce il titolo del libro
     * @return una stringa che rappresenta il titolo del libro
     */

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getnPagine() {
        return nPagine;
    }

    public void setnPagine(int nPagine) {
        this.nPagine = nPagine;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }


}

/* la classe libro aiuta lo sviluppatore a gestire dati del libro */

    