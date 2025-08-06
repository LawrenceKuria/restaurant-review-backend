package com.lawrence.restaurant.mappers;

import com.lawrence.restaurant.domain.ReviewCreateUpdateRequest;
import com.lawrence.restaurant.domain.dtos.ReviewCreateUpdateRequestDto;
import com.lawrence.restaurant.domain.dtos.ReviewDto;
import com.lawrence.restaurant.domain.entities.Review;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ReviewMapper {

    ReviewCreateUpdateRequest toReviewCreateUpdateRequest(ReviewCreateUpdateRequestDto dto);

    ReviewDto toDto(Review review);

}
