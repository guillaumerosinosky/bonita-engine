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
package org.bonitasoft.engine.dependency.model.builder.impl;

import org.bonitasoft.engine.dependency.model.builder.SPlatformDependencyMappingBuilder;
import org.bonitasoft.engine.dependency.model.impl.SPlatformDependencyMappingImpl;

public class SPlatformDependencyMappingBuilderImpl implements SPlatformDependencyMappingBuilder {

    private final SPlatformDependencyMappingImpl object;

    public SPlatformDependencyMappingBuilderImpl(final SPlatformDependencyMappingImpl object) {
        super();
        this.object = object;
    }

    @Override
    public SPlatformDependencyMappingImpl done() {
        return object;
    }

}
