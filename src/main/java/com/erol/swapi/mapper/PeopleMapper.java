package com.erol.swapi.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import com.erol.swapi.model.People;
import com.erol.swapi.web.dto.CreatePeopleRequest;

@Mapper
public interface PeopleMapper {

   @Mapping(target = "id", ignore = true)
   @Mapping(source = "gender", target = "gender", defaultValue = "UNKNOWN")
   public abstract People peopleFromCreateRequest(CreatePeopleRequest req);
}


