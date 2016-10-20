/*
 * Copyright (C) 2016 Matthias Fussenegger
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package gzipper.application.util;

import java.io.File;

/**
 * Used to validate files, e.g. file paths.
 *
 * @author Matthias Fussenegger
 */
public class FileValidator {

    /**
     * Validates the file path.
     *
     * @param path The path to be validated
     * @return True if path is valid, false otherwise
     */
    public static boolean isValidPath(String path) {
        File file = new File(path);
        return file.exists() && file.isDirectory();
    }
}
