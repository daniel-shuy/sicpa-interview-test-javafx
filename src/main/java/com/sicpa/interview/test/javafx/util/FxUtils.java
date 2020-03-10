package com.sicpa.interview.test.javafx.util;

import javafx.scene.control.TextFormatter;
import javafx.scene.control.TextInputControl;

import java.util.function.UnaryOperator;
import java.util.regex.Pattern;

public class FxUtils {
	private static final Pattern REGEX_VOWELS = Pattern.compile("[AEIOU]", Pattern.CASE_INSENSITIVE);

	/**
	 * A {@link TextFormatter} {@link TextFormatter#getFilter() filter} to restrict intput to vowels.
	 */
	private static final UnaryOperator<TextFormatter.Change> VOWELS_TEXT_FORMATTER_FILTER = change ->
			(change == null
				|| !change.isContentChange()
				|| change.getText().isEmpty()
				|| REGEX_VOWELS.matcher(change.getText()).matches()
			) ? change : null;

	public static void setVowelsTextFormatterFilter(TextInputControl textInputControl) {
		textInputControl.setTextFormatter(new TextFormatter<>(VOWELS_TEXT_FORMATTER_FILTER));
	}

	public static void setAutoCapitalizeChangeListener(TextInputControl textInputControl) {
		textInputControl.textProperty().addListener((observable, oldValue, newValue) ->
				textInputControl.setText(newValue.toUpperCase()));
	}
}
