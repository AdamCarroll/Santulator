/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */

package io.github.santulator.gui.main;

import io.github.santulator.gui.dialogues.FileDialogueType;
import io.github.santulator.gui.dialogues.FileFormatType;
import io.github.santulator.session.SessionState;

import java.nio.file.Path;

public interface GuiTestValidator {
    void validateWebPage(final String page);

    void validateSavedSession(Path file, final SessionState expected);

    void setUpFileDialogue(FileDialogueType dialogueType, final FileFormatType fileType, String file);

    void setUpFileDialogue(FileDialogueType dialogueType, final FileFormatType fileType, Path file);
}
