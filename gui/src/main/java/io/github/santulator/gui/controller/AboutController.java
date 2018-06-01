package io.github.santulator.gui.controller;

import io.github.santulator.gui.common.BuildInfo;
import io.github.santulator.gui.common.GuiConstants;
import io.github.santulator.gui.services.WebPageTool;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import javax.inject.Inject;

public class AboutController {
    private final WebPageTool webPageTool;

    @FXML
    private Button buttonClose;

    @FXML
    private Hyperlink linkWebsite;

    @FXML
    private Hyperlink linkTwitter;

    @FXML
    private Label labelVersion;

    @Inject
    public AboutController(final WebPageTool webPageTool) {
        this.webPageTool = webPageTool;
    }

    public void initialise(final Stage stage) {
        buttonClose.setOnAction(e -> stage.close());
        linkWebsite.setOnAction(e -> webPageTool.showWebPage(GuiConstants.WEBSITE));
        linkTwitter.setOnAction(e -> webPageTool.showWebPage(GuiConstants.TWITTER));
        setupVersion();
    }

    private void setupVersion() {
        String template = labelVersion.getText();
        String text = String.format(template, BuildInfo.version());

        labelVersion.setText(text);
    }
}
