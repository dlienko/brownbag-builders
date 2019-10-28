package com.github.dlienko.brownbags.builders;

import java.util.UUID;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import lombok.With;

@Value
@RequiredArgsConstructor
@With
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

  Address(UUID id, UUID userId, String zipCode, String city) {
    this(id, userId, zipCode, city, null, null, null, null);
  }

}
