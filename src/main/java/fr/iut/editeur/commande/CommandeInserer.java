package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeInserer extends CommandeDocument{
    public CommandeInserer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : inserer;index;chaine"); // ON VERIFIE LES 4 PARAMETRES
            return;
        }
        String texte = parameters[2];
        this.document.inserer(Integer.parseInt(parameters[1]), texte); //appel de la fonction de remplacement de document
        super.executer();
    }

    @Override
    public void getDescriptionCommand() {
        System.out.println("commande pour inserer un bout de texte à un certain endroit du texte déjà existant du document");
    }
}