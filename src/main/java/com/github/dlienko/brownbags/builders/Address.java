package com.github.dlienko.brownbags.builders;

import java.util.UUID;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;

@Value
@Builder
class Address {

  @NonNull
  UUID id;

  @NonNull
  UUID userId;

  @NonNull
  String zipCode;

  @NonNull
  String city;

  String streetName;

  String houseNumber;

  String apartmentNumber;

  String entranceCode;

  static AddressBuilder builder(UUID id, UUID userId, String zipCode, String city) {
    return new AddressBuilder()
        .id(id)
        .userId(userId)
        .zipCode(zipCode)
        .city(city);
  }

}
