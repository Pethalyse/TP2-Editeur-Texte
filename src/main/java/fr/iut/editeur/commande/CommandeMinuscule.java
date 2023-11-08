package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeMinuscule extends CommandeDocument{
    public CommandeMinuscule(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : minuscules;depart;fin"); // ON VERIFIE LES 4 PARAMETRES
            return;
        }
        this.document.minuscules(Integer.parseInt(parameters[1]), Integer.parseInt(parameters[2])); //appel de la fonction de remplacement de document
        super.executer();
    }

}
