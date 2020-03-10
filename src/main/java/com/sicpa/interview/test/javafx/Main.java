package com.sicpa.interview.test.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
	@Override
	public void start(Stage stage) throws IOException {
		var fxmlLocation = Main.class.getResource("/fxml/view/Application.fxml");
		var scene = new Scene(new FXMLLoader(fxmlLocation).load());
		stage.setScene(scene);
		stage.show();
	}
}
