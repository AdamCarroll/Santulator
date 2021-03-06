/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */

package io.github.santulator.session;

import io.github.santulator.model.SessionState;

import java.nio.file.Path;

public interface SessionSerialiser {
    void write(Path file, SessionState state);

    SessionState read(Path file);
}
