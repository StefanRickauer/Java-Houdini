package com.rickauer.houdini;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
	
	private static String PROGRAM = "Houdini";
	private static String VERSION = "0.02";
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
		Text msg = new Text("Test Screen.");
		VBox root = new VBox();
		root.getChildren().add(msg);
		
		Scene scene = new Scene(root, 300, 50);
		stage.setScene(scene);
		stage.setMaximized(true);
		stage.setTitle(PROGRAM_AND_VERSION);
		stage.show();
	}
}
