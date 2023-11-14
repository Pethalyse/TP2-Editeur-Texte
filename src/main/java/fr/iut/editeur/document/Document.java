package fr.iut.editeur.document;

/**
 * Class objet Document qui contient toutes les données d'un document
 */
public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    /**
     * Ajouter du texte en fin de document
     * @param texte le bout d etexte à ajouter
     */
    public void ajouter(String texte) {
        this.texte += texte;
    }

    public void remplacer(int start, int end, String remplacement) {
        String leftPart = texte.substring(0, start);
        String rightPart = texte.substring(end);
        texte = leftPart + remplacement + rightPart;
    }

    public void majuscules(int start, int end) {
        remplacer(start, end,  texte.substring(start, end).toUpperCase());
    }

    public void effacer(int i, int i1) {
        remplacer(i, i1, "");
    }

    public void clear() {
        effacer(0, texte.length()-1);
    }

    @Override
    public String toString() {
        return this.texte;
    }


}
