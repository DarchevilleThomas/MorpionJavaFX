package org.morpion;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainSceneController {
	
	boolean start = false;
	Morpion morpion = new Morpion();

	@FXML
	private Label LabelEnd;
	
    @FXML
    private Button Button1;

    @FXML
    private Button Button2;

    @FXML
    private Button Button3;

    @FXML
    private Button Button4;

    @FXML
    private Button Button5;

    @FXML
    private Button Button6;

    @FXML
    private Button Button7;

    @FXML
    private Button Button8;

    @FXML
    private Button Button9;

    @FXML
    private Button ButtonStart;

    @FXML
    void Button1Click(ActionEvent event) {
    	if (start == true) {
        	if (morpion.getNbTours()%2==0) {
        		LabelEnd.setText("Au joueur 1 de jouer !");
        	}
        	else {
        		LabelEnd.setText("Au joueur 2 de jouer !");
        	}
    		if (morpion.getNbTours()%2==0) {
    			morpion.addJeton(0);
    			if (Button1.getText().equals("")){
        			Button1.setText("O");		
    			}
    			morpion.afficherMorpion();
    		}
    		else {
    			morpion.addJeton(0);
    			if (Button1.getText().equals("")){
        			Button1.setText("X");		
    			}
    			morpion.afficherMorpion();
    		}
    	}
    	if (morpion.tableauRempli()==true) {
    		start = false;
    		LabelEnd.setText("Fin de la partie ! Le tableau est rempli !");
    		ButtonStart.setText("RESTART");
    		ButtonStart.setVisible(true);
    	}
    	if (morpion.winMorpion()==true) {
    		start = false;
    		if (morpion.getNbTours()%2==0) {
    			LabelEnd.setText("Le joueur 1 a gagné !");
    		}
    		else {
    			LabelEnd.setText("Le joueur 2 a gagné !");
    		}
    		ButtonStart.setText("RESTART");
    		ButtonStart.setVisible(true);
    	}
    }

    @FXML
    void Button2Click(ActionEvent event) {
    	if (start == true) {
        	if (morpion.getNbTours()%2==0) {
        		LabelEnd.setText("Au joueur 1 de jouer !");
        	}
        	else {
        		LabelEnd.setText("Au joueur 2 de jouer !");
        	}
    		if (morpion.getNbTours()%2==0) {
    			morpion.addJeton(1);
    			if (Button2.getText().equals("")){
        			Button2.setText("O");		
    			}
    			morpion.afficherMorpion();
    		}
    		else {
    			morpion.addJeton(1);
    			if (Button2.getText().equals("")){
        			Button2.setText("X");		
    			}
    			morpion.afficherMorpion();
    		}
    	}
    	if (morpion.tableauRempli()==true) {
    		start = false;
    		LabelEnd.setText("Fin de la partie ! Le tableau est rempli !");
    		ButtonStart.setText("RESTART");
    		ButtonStart.setVisible(true);
    	}
    	if (morpion.winMorpion()==true) {
    		start = false;
    		if (morpion.getNbTours()%2==0) {
    			LabelEnd.setText("Le joueur 1 a gagné !");
    		}
    		else {
    			LabelEnd.setText("Le joueur 2 a gagné !");
    		}
    		ButtonStart.setText("RESTART");
    		ButtonStart.setVisible(true);
    	}
    }

    @FXML
    void Button3Click(ActionEvent event) {
    	if (start == true) {
        	if (morpion.getNbTours()%2==0) {
        		LabelEnd.setText("Au joueur 1 de jouer !");
        	}
        	else {
        		LabelEnd.setText("Au joueur 2 de jouer !");
        	}
    		if (morpion.getNbTours()%2==0) {
    			morpion.addJeton(2);
    			if (Button3.getText().equals("")){
        			Button3.setText("O");		
    			}
    			morpion.afficherMorpion();
    		}
    		else {
    			morpion.addJeton(2);
    			if (Button3.getText().equals("")){
        			Button3.setText("X");		
    			}
    			morpion.afficherMorpion();
    		}
    	}
    	if (morpion.tableauRempli()==true) {
    		start = false;
    		LabelEnd.setText("Fin de la partie ! Le tableau est rempli !");
    		ButtonStart.setText("RESTART");
    		ButtonStart.setVisible(true);
    	}
    	if (morpion.winMorpion()==true) {
    		start = false;
    		if (morpion.getNbTours()%2==0) {
    			LabelEnd.setText("Le joueur 1 a gagné !");
    		}
    		else {
    			LabelEnd.setText("Le joueur 2 a gagné !");
    		}
    		ButtonStart.setText("RESTART");
    		ButtonStart.setVisible(true);
    	}
    }

    @FXML
    void Button4Click(ActionEvent event) {
    	if (start == true) {
        	if (morpion.getNbTours()%2==0) {
        		LabelEnd.setText("Au joueur 1 de jouer !");
        	}
        	else {
        		LabelEnd.setText("Au joueur 2 de jouer !");
        	}
    		if (morpion.getNbTours()%2==0) {
    			morpion.addJeton(3);
    			if (Button4.getText().equals("")){
        			Button4.setText("O");		
    			}
    			morpion.afficherMorpion();
    		}
    		else {
    			morpion.addJeton(3);
    			if (Button4.getText().equals("")){
        			Button4.setText("X");		
    			}
    			morpion.afficherMorpion();
    		}
    	}
    	if (morpion.tableauRempli()==true) {
    		start = false;
    		LabelEnd.setText("Fin de la partie ! Le tableau est rempli !");
    		ButtonStart.setText("RESTART");
    		ButtonStart.setVisible(true);
    	}
    	if (morpion.winMorpion()==true) {
    		start = false;
    		if (morpion.getNbTours()%2==0) {
    			LabelEnd.setText("Le joueur 1 a gagné !");
    		}
    		else {
    			LabelEnd.setText("Le joueur 2 a gagné !");
    		}
    		ButtonStart.setText("RESTART");
    		ButtonStart.setVisible(true);
    	}
    }

    @FXML
    void Button5Click(ActionEvent event) {
    	if (start == true) {
        	if (morpion.getNbTours()%2==0) {
        		LabelEnd.setText("Au joueur 1 de jouer !");
        	}
        	else {
        		LabelEnd.setText("Au joueur 2 de jouer !");
        	}
    		if (morpion.getNbTours()%2==0) {
    			morpion.addJeton(4);
    			if (Button5.getText().equals("")){
        			Button5.setText("O");		
    			}
    			morpion.afficherMorpion();
    		}
    		else {
    			morpion.addJeton(4);
    			if (Button5.getText().equals("")){
        			Button5.setText("X");		
    			}
    			morpion.afficherMorpion();
    		}
    	}
    	if (morpion.tableauRempli()==true) {
    		start = false;
    		LabelEnd.setText("Fin de la partie ! Le tableau est rempli !");
    		ButtonStart.setText("RESTART");
    		ButtonStart.setVisible(true);
    	}
    	if (morpion.winMorpion()==true) {
    		start = false;
    		if (morpion.getNbTours()%2==0) {
    			LabelEnd.setText("Le joueur 1 a gagné !");
    		}
    		else {
    			LabelEnd.setText("Le joueur 2 a gagné !");
    		}
    		ButtonStart.setText("RESTART");
    		ButtonStart.setVisible(true);
    	}
    }

    @FXML
    void Button6Click(ActionEvent event) {
    	if (start == true) {
        	if (morpion.getNbTours()%2==0) {
        		LabelEnd.setText("Au joueur 1 de jouer !");
        	}
        	else {
        		LabelEnd.setText("Au joueur 2 de jouer !");
        	}
    		if (morpion.getNbTours()%2==0) {
    			morpion.addJeton(5);
    			if (Button6.getText().equals("")){
        			Button6.setText("O");		
    			}
    			morpion.afficherMorpion();
    		}
    		else {
    			morpion.addJeton(5);
    			if (Button6.getText().equals("")){
        			Button6.setText("X");		
    			}
    			morpion.afficherMorpion();
    		}
    	}
    	if (morpion.tableauRempli()==true) {
    		start = false;
    		LabelEnd.setText("Fin de la partie ! Le tableau est rempli !");
    		ButtonStart.setText("RESTART");
    		ButtonStart.setVisible(true);
    	}
    	if (morpion.winMorpion()==true) {
    		start = false;
    		if (morpion.getNbTours()%2==0) {
    			LabelEnd.setText("Le joueur 1 a gagné !");
    		}
    		else {
    			LabelEnd.setText("Le joueur 2 a gagné !");
    		}
    		ButtonStart.setText("RESTART");
    		ButtonStart.setVisible(true);
    	}
    }

    @FXML
    void Button7Click(ActionEvent event) {
    	if (start == true) {
        	if (morpion.getNbTours()%2==0) {
        		LabelEnd.setText("Au joueur 1 de jouer !");
        	}
        	else {
        		LabelEnd.setText("Au joueur 2 de jouer !");
        	}
    		if (morpion.getNbTours()%2==0) {
    			morpion.addJeton(6);
    			if (Button7.getText().equals("")){
        			Button7.setText("O");		
    			}
    			morpion.afficherMorpion();
    		}
    		else {
    			morpion.addJeton(6);
    			if (Button7.getText().equals("")){
        			Button7.setText("X");		
    			}
    			morpion.afficherMorpion();
    		}
    	}
    	if (morpion.tableauRempli()==true) {
    		start = false;
    		LabelEnd.setText("Fin de la partie ! Le tableau est rempli !");
    		ButtonStart.setText("RESTART");
    		ButtonStart.setVisible(true);
    	}
    	if (morpion.winMorpion()==true) {
    		start = false;
    		if (morpion.getNbTours()%2==0) {
    			LabelEnd.setText("Le joueur 1 a gagné !");
    		}
    		else {
    			LabelEnd.setText("Le joueur 2 a gagné !");
    		}
    		ButtonStart.setText("RESTART");
    		ButtonStart.setVisible(true);
    	}
    }

    @FXML
    void Button8Click(ActionEvent event) {
    	if (start == true) {
        	if (morpion.getNbTours()%2==0) {
        		LabelEnd.setText("Au joueur 1 de jouer !");
        	}
        	else {
        		LabelEnd.setText("Au joueur 2 de jouer !");
        	}
    		if (morpion.getNbTours()%2==0) {
        		morpion.addJeton(7);
    			if (Button8.getText().equals("")){
        			Button8.setText("O");		
    			}
    			morpion.afficherMorpion();
    		}
    		else {
        		morpion.addJeton(7);
    			if (Button8.getText().equals("")){
        			Button8.setText("X");		
    			}
    			morpion.afficherMorpion();
    		}
    	}
    	if (morpion.tableauRempli()==true) {
    		start = false;
    		LabelEnd.setText("Fin de la partie ! Le tableau est rempli !");
    		ButtonStart.setText("RESTART");
    		ButtonStart.setVisible(true);
    	}
    	if (morpion.winMorpion()==true) {
    		start = false;
    		if (morpion.getNbTours()%2==0) {
    			LabelEnd.setText("Le joueur 1 a gagné !");
    		}
    		else {
    			LabelEnd.setText("Le joueur 2 a gagné !");
    		}
    		ButtonStart.setText("RESTART");
    		ButtonStart.setVisible(true);
    	}
    }

    @FXML
    void Button9Click(ActionEvent event) {
    	if (start == true) {
        	if (morpion.getNbTours()%2==0) {
        		LabelEnd.setText("Au joueur 1 de jouer !");
        	}
        	else {
        		LabelEnd.setText("Au joueur 2 de jouer !");
        	}
    		if (morpion.getNbTours()%2==0) {
    			morpion.addJeton(8);
    			if (Button9.getText().equals("")){
        			Button9.setText("O");		
    			}
    			morpion.afficherMorpion();
    		}
    		else {
    			morpion.addJeton(8);
    			if (Button9.getText().equals("")){
        			Button9.setText("X");		
    			}
    			morpion.afficherMorpion();
    		}
    	}
    	if (morpion.tableauRempli()==true) {
    		start = false;
    		LabelEnd.setText("Fin de la partie ! Le tableau est rempli !");
    		ButtonStart.setText("RESTART");
    		ButtonStart.setVisible(true);
    	}
    	if (morpion.winMorpion()==true) {
    		start = false;
    		if (morpion.getNbTours()%2==0) {
    			LabelEnd.setText("Le joueur 1 a gagné !");
    		}
    		else {
    			LabelEnd.setText("Le joueur 2 a gagné !");
    		}
    		ButtonStart.setText("RESTART");
    		ButtonStart.setVisible(true);
    	}
    }

    @FXML
    void StartClick(ActionEvent event) {
    	ButtonStart.setVisible(false);
    	start = true;
    	morpion.initialiserMorpion();
    	Button1.setText("");
    	Button2.setText("");
    	Button3.setText("");
    	Button4.setText("");
    	Button5.setText("");
    	Button6.setText("");
    	Button7.setText("");
    	Button8.setText("");
    	Button9.setText("");
    	LabelEnd.setText("Au joueur 1 de jouer !");
    }

}
