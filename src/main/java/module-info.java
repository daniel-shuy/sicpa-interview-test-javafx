module interview.test.javafx {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;

	opens com.sicpa.interview.test.javafx.controller to javafx.fxml;
	exports com.sicpa.interview.test.javafx;
}
