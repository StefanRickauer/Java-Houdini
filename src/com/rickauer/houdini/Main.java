package com.rickauer.houdini;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
	
	private static String PROGRAM = "Houdini";
	private static String VERSION = "0.0201";
	private static String PROGRAM_AND_VERSION = PROGRAM + " " + VERSION;
	
	private static Logger mainLogger = LogManager.getLogger(Main.class.getName());
	
	public static void main(String[] args) {

		mainLogger.info(PROGRAM_AND_VERSION + " starting ...");
		try {
			System.out.println(PROGRAM_AND_VERSION);
			Application.launch(args);
			
		} catch (Exception exception) {
			mainLogger.error(exception.getMessage());
			exception.printStackTrace();
		}
		mainLogger.info(PROGRAM_AND_VERSION + " finished.");
	}
	
	@Override
	public void start(Stage stage) {
		// Top node
		Node top = null;
		
		// Left node
		Node left = null;
		
		// Center node for content
		VBox center = createCenter();
		
		// Right node
		Button okBtn = new Button("OK");
		Button cancelBtn = new Button("Cancel");
		
		okBtn.setMaxWidth(Double.MAX_VALUE);
		VBox right = new VBox(okBtn, cancelBtn);
		right.setStyle("-fx-padding: 15;");
		
		// Bottom node
		Label statusLbl = new Label("Status: In development...");
		HBox bottom = new HBox(statusLbl);
		BorderPane.setMargin(bottom, new Insets(15, 0, 0, 0));
		bottom.setStyle("-fx-background-color: lightgrey;" +
						"-fx-font-size: 8pt;" +
						"-fx-padding: 15 0 0 0");
		
		BorderPane root = new BorderPane(center, top, right, bottom, left);
		root.setStyle("-fx-background-color: yellow;");
		
		Scene scene = new Scene(root, 300, 50);
		stage.setScene(scene);
		stage.setMaximized(true);
		stage.setTitle(PROGRAM_AND_VERSION);
		stage.show();
	}
	
	private VBox createCenter() {
		Label nameLbl = new Label("Placehodler");
		TextField nameFld = new TextField();
		HBox.setHgrow(nameFld, Priority.ALWAYS);
		HBox nameFields = new HBox(nameLbl, nameFld);
		
		Label inputLbl = new Label("Enter your message here:");
		TextArea inputText = new TextArea();
		inputText.setPrefColumnCount(20);
		inputText.setPrefRowCount(5);
		VBox.setVgrow(inputText, Priority.ALWAYS);
		
		VBox center = new VBox(nameFields, inputLbl, inputText);
		
		return center;
	}
}
