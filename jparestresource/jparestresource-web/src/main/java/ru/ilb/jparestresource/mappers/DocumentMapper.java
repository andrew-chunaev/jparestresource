/*
 * Copyright 2017 slavb.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ru.ilb.jparestresource.mappers;

import java.util.List;
import org.mapstruct.Mapper;
import ru.ilb.jparestresource.view.Document;
import ru.ilb.jparestresource.view.Documents;

/**
 *
 * @author slavb
 */
@Mapper(uses = {DocfileMapper.class, UserMapper.class}, componentModel = "spring")
public interface DocumentMapper extends GenericMapper<ru.ilb.jparestresource.model.Document,Document>{

    default Documents createWrapperFromEntities(List<ru.ilb.jparestresource.model.Document> entities) {
        Documents documents = new Documents();
        documents.setDocuments(createFromEntities(entities));
        return documents;
    }

}
