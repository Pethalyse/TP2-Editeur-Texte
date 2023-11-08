package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeRemplacer extends CommandeDocument{
    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 4) {
            System.err.println("Format attendu : remplacer;depart;fin;chaine"); // ON VERIFIE LES 4 PARAMETRES
            return;
        }
        String texte = parameters[3];
        this.document.remplacer(Integer.parseInt(parameters[1]), Integer.parseInt(parameters[2]), texte); //appel de la fonction de remplacement de document
        super.executer();
    }

    @Override
    public void getDescriptionCommand() {
        System.out.println("commande pour remplacer un bout de texte par un autre");
    }
}
