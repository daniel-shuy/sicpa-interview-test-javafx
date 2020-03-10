package com.sicpa.interview.test.javafx.controller;

import com.sicpa.interview.test.javafx.util.FxUtils;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ApplicationController implements Initializable {
	@FXML
	protected TextField textFieldAutoCapitalize;

	@FXML
	protected TextField textFieldVowel;

	@FXML
	protected TextField textFieldBoth;

	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {
		FxUtils.setAutoCapitalizeChangeListener(textFieldAutoCapitalize);

		FxUtils.setVowelsTextFormatterFilter(textFieldVowel);

		FxUtils.setAutoCapitalizeChangeListener(textFieldBoth);
		FxUtils.setVowelsTextFormatterFilter(textFieldBoth);
	}
}
