/*
 * Copyright (C) 2014 BonitaSoft S.A.
 * BonitaSoft, 32 rue Gustave Eiffel - 38000 Grenoble
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2.0 of the License, or
 * (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.bonitasoft.engine.core.process.definition.model.impl;

import org.bonitasoft.engine.bpm.document.DocumentListDefinition;
import org.bonitasoft.engine.core.process.definition.model.SDocumentListDefinition;
import org.bonitasoft.engine.core.process.definition.model.builder.ServerModelConvertor;
import org.bonitasoft.engine.expression.model.SExpression;

/**
 * @author Baptiste Mesta
 */
public class SDocumentListDefinitionImpl extends SNamedElementImpl implements SDocumentListDefinition {

    private static final long serialVersionUID = 1L;

    private String description;

    private SExpression expression;

    /**
     * @param name
     *        the name of the list
     */
    public SDocumentListDefinitionImpl(final String name) {
        super(name);
    }

    public SDocumentListDefinitionImpl(DocumentListDefinition documentListDefinition) {
        super(documentListDefinition.getName());
        description = documentListDefinition.getDescription();
        expression = ServerModelConvertor.convertExpression(documentListDefinition.getExpression());
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SExpression getExpression() {
        return expression;
    }

    public void setExpression(SExpression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "SDocumentDefinitionImpl{" +
                "description='" + description + '\'' +
                ", expression=" + expression +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        if (!super.equals(o))
            return false;

        SDocumentListDefinitionImpl that = (SDocumentListDefinitionImpl) o;

        if (description != null ? !description.equals(that.description) : that.description != null)
            return false;
        if (expression != null ? !expression.equals(that.expression) : that.expression != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (expression != null ? expression.hashCode() : 0);
        return result;
    }

}
