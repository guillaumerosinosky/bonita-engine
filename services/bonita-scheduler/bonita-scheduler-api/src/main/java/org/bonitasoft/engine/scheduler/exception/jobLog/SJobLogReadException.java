/**
 * Copyright (C) 2013 BonitaSoft S.A.
 * BonitaSoft, 32 rue Gustave Eiffel - 38000 Grenoble
 * This library is free software; you can redistribute it and/or modify it under the terms
 * of the GNU Lesser General Public License as published by the Free Software Foundation
 * version 2.1 of the License.
 * This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU Lesser General Public License along with this
 * program; if not, write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth
 * Floor, Boston, MA 02110-1301, USA.
 **/
package org.bonitasoft.engine.scheduler.exception.jobLog;

import org.bonitasoft.engine.scheduler.exception.SSchedulerException;

/**
 * @author Celine Souchet
 */
public class SJobLogReadException extends SSchedulerException {

    private static final long serialVersionUID = -226779259333121029L;

    public SJobLogReadException(final String message) {
        super(message);
    }

    public SJobLogReadException(final Exception e) {
        super(e);
    }

    public SJobLogReadException(final String message, final Exception exception) {
        super(message, exception);
    }

}
