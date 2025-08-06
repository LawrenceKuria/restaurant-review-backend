package com.lawrence.restaurant.services;

import com.lawrence.restaurant.domain.GeoLocation;
import com.lawrence.restaurant.domain.entities.Address;

public interface GeoLocationService {
    GeoLocation geoLocate(Address address);
}
