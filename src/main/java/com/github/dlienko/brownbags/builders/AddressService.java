package com.github.dlienko.brownbags.builders;

import java.util.UUID;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class AddressService {

  private final AddressRepository addressRepository;

  void addAddress() {
    Address address = Address.builder()
        .id(UUID.randomUUID())
        .userId(UUID.randomUUID())
        .city("Poznań")
        .streetName("ul. Maratońska")
        .houseNumber("2a")
        .build();

    addressRepository.save(address);
  }

}
