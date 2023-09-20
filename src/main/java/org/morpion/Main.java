package org.morpion;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.File;
import java.net.URL;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			URL url = new File("src/main/java/org/morpion/MainScene.fxml").toURI().toURL();
			Parent root = FXMLLoader.load(url);
			Scene scene = new Scene(root);
			
			primaryStage.setTitle("Morpion");
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setResizable(false);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
