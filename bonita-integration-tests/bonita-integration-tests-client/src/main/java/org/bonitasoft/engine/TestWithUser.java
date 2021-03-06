/**
 * Copyright (C) 2014 Bonitasoft S.A.
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
package org.bonitasoft.engine;

import org.bonitasoft.engine.identity.User;
import org.junit.After;
import org.junit.Before;

/**
 * @author Celine Souchet
 * @version 6.4.1
 * @since 6.4.1
 */
public class TestWithUser extends TestWithTechnicalUser {

    protected User user;

    @Override
    @Before
    public void before() throws Exception {
        super.before();
        user = createUser(USERNAME, PASSWORD);
        logoutOnTenant();
        loginOnDefaultTenantWith(USERNAME, PASSWORD);
    }

    @Override
    @After
    public void after() throws Exception {
        logoutOnTenant();
        loginOnDefaultTenantWithDefaultTechnicalUser();
        deleteUser(USERNAME);
        super.after();
    }

}
