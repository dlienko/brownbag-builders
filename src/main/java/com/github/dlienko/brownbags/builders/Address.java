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

  static IdBuilder builder() {
    return new AddressBuilder();
  }

  interface IdBuilder {
    UserIdBuilder id(UUID uuid);
  }

  interface UserIdBuilder {
    ZipCodeBuilder userId(UUID userId);
  }

  interface ZipCodeBuilder {
    CityBuilder zipCode(String zipCode);
  }

  interface CityBuilder {
    AddressBuilder city(String city);
  }

  @SuppressWarnings("WeakerAccess")
  static class AddressBuilder
      implements IdBuilder, UserIdBuilder, ZipCodeBuilder, CityBuilder {
  }
}
