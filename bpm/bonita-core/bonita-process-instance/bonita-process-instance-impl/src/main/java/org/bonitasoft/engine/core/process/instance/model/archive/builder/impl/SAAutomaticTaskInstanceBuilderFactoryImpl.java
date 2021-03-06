/**
 * Copyright (C) 2011 BonitaSoft S.A.
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
package org.bonitasoft.engine.core.process.instance.model.archive.builder.impl;

import org.bonitasoft.engine.core.process.instance.model.SAutomaticTaskInstance;
import org.bonitasoft.engine.core.process.instance.model.archive.builder.SAAutomaticTaskInstanceBuilder;
import org.bonitasoft.engine.core.process.instance.model.archive.builder.SAAutomaticTaskInstanceBuilderFactory;
import org.bonitasoft.engine.core.process.instance.model.archive.impl.SAAutomaticTaskInstanceImpl;

/**
 * @author Baptiste Mesta
 */
public class SAAutomaticTaskInstanceBuilderFactoryImpl extends SAActivityInstanceBuilderFactoryImpl implements SAAutomaticTaskInstanceBuilderFactory {

    @Override
    public SAAutomaticTaskInstanceBuilder createNewAutomaticTaskInstance(final SAutomaticTaskInstance sAutomaticTaskInstance) {
        final SAAutomaticTaskInstanceImpl entity = new SAAutomaticTaskInstanceImpl(sAutomaticTaskInstance);
        return new SAAutomaticTaskInstanceBuilderImpl(entity);
    }

}
