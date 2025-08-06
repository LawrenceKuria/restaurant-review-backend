package com.lawrence.restaurant.mappers;

import com.lawrence.restaurant.domain.dtos.PhotoDto;
import com.lawrence.restaurant.domain.entities.Photo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PhotoMapper {

    PhotoDto toDto(Photo photo);

}
