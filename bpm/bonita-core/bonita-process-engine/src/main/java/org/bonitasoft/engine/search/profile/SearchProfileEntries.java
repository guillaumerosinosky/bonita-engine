/**
 * Copyright (C) 2013 BonitaSoft S.A.
 * BonitaSoft, 31 rue Gustave Eiffel - 38000 Grenoble
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
package org.bonitasoft.engine.search.profile;

import java.util.List;

import org.bonitasoft.engine.persistence.QueryOptions;
import org.bonitasoft.engine.persistence.SBonitaReadException;
import org.bonitasoft.engine.profile.ProfileEntry;
import org.bonitasoft.engine.profile.ProfileService;
import org.bonitasoft.engine.profile.model.SProfileEntry;
import org.bonitasoft.engine.search.AbstractSearchEntity;
import org.bonitasoft.engine.search.SearchOptions;
import org.bonitasoft.engine.search.descriptor.SearchProfileEntryDescriptor;
import org.bonitasoft.engine.service.ModelConvertor;

/**
 * @author Celine Souchet
 */
public class SearchProfileEntries extends AbstractSearchEntity<ProfileEntry, SProfileEntry> {

    private final ProfileService profileService;

    public SearchProfileEntries(final ProfileService profileService, final SearchProfileEntryDescriptor searchDescriptor, final SearchOptions options) {
        super(searchDescriptor, options);
        this.profileService = profileService;
    }

    @Override
    public long executeCount(final QueryOptions queryOptions) throws SBonitaReadException {
        return profileService.getNumberOfProfileEntries(queryOptions);
    }

    @Override
    public List<SProfileEntry> executeSearch(final QueryOptions queryOptions) throws SBonitaReadException {
        return profileService.searchProfileEntries(queryOptions);
    }

    @Override
    public List<ProfileEntry> convertToClientObjects(final List<SProfileEntry> serverObjects) {
        return ModelConvertor.toProfileEntries(serverObjects);
    }

}
