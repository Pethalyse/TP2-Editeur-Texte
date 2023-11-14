package fr.iut.editeur.commande.factory;

import fr.iut.editeur.commande.*;
import fr.iut.editeur.document.Document;

/**
 * Class d'appel de methode
 * Singleton
 */
public class CommandeFactory {

    private static CommandeFactory instance;

    public static CommandeFactory getInstance() {
        if(instance == null) {
            instance = new CommandeFactory();
        }
        return instance;
    }

    private CommandeFactory() {}

    /**
     * Methode qui permet d'appeler les differentes actions sur le document
     * @param name le nom de l'action
     * @param document le document {@link Document}
     * @param parameters les parametes de l'action donné en paramètre actions
     */
    public Commande createCommand(String name, Document document, String[] parameters) {
        switch (name) {
            case "ajouter" : return new CommandeAjouter(document, parameters);
            case "remplacer": return new CommandeRemplacer(document, parameters);
            case "majuscules" : return new CommandeMajuscule(document, parameters);
            case "effacer" : return new CommandeEffacer(document, parameters);
            case "clear" : return new CommandeClear(document, parameters);
            case "inserer" : return new CommandeInserer(document, parameters);
            case "minuscules" : return new CommandeMinuscule(document, parameters);
            default: return null;
        }
    }

}
