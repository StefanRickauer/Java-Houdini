module Houdini {
	requires javafx.graphics;
	requires javafx.controls;
	requires java.desktop;
	requires javafx.swing;
	requires javafx.media;
	requires javafx.web;
	requires javafx.fxml;
	requires jdk.jsobject;
	requires org.apache.logging.log4j;
	
	opens com.rickauer.houdini to javafx.graphics, javafx.base;
}