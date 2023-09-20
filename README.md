Pour faire fonctionner le projet il faut :

-Télécharger au minimum la version 3.8.0 du plugin e(fx)clipse sur le Eclipse Marketplace
-Importer la librairie JavaFX au projet
-Supprimer la librairie JavaFX SDK du projet
-Ajouter une Run Configuration dans Java Application:
  Main Class = application.Main
  Arguments -> VM arguments : --module-path "PATH\javafx-sdk-20\lib" --add-modules javafx.controls,javafx.fxml 


## Ajout à faire ##
- Importer JavaFX avec Gradle ou Maven
