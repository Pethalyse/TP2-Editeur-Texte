package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeMajuscule extends CommandeDocument{
    public CommandeMajuscule(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : majuscules;depart;fin"); // ON VERIFIE LES 4 PARAMETRES
            return;
        }
        this.document.majuscules(Integer.parseInt(parameters[1]), Integer.parseInt(parameters[2])); //appel de la fonction de remplacement de document
        super.executer();
    }

    @Override
    public void getDescriptionCommand() {
        System.out.println("commande pour mettre en majuscule une bout de texte");
    }

}
