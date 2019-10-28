package com.github.dlienko.brownbags.builders;

import java.util.UUID;
import lombok.NonNull;
import lombok.Value;

@Value
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

  static class AddressBuilder
      implements IdBuilder, UserIdBuilder, ZipCodeBuilder, CityBuilder {

    private UUID id;
    private UUID userId;
    private String zipCode;
    private String city;
    private String streetName;
    private String houseNumber;
    private String apartmentNumber;
    private String entranceCode;

    private AddressBuilder() {
    }

    @Override
    public AddressBuilder id(@NonNull UUID id) {
      this.id = id;
      return this;
    }

    @Override
    public AddressBuilder userId(@NonNull UUID userId) {
      this.userId = userId;
      return this;
    }

    @Override
    public AddressBuilder zipCode(@NonNull String zipCode) {
      this.zipCode = zipCode;
      return this;
    }

    @Override
    public AddressBuilder city(@NonNull String city) {
      this.city = city;
      return this;
    }

    AddressBuilder streetName(String streetName) {
      this.streetName = streetName;
      return this;
    }

    AddressBuilder houseNumber(String houseNumber) {
      this.houseNumber = houseNumber;
      return this;
    }

    AddressBuilder apartmentNumber(String apartmentNumber) {
      this.apartmentNumber = apartmentNumber;
      return this;
    }

    AddressBuilder entranceCode(String entranceCode) {
      this.entranceCode = entranceCode;
      return this;
    }

    Address build() {
      return new Address(
          id, userId, zipCode, city, streetName, houseNumber, apartmentNumber, entranceCode);
    }
  }
}
