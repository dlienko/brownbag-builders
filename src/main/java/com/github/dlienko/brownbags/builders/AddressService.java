package com.github.dlienko.brownbags.builders;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class AddressService {

  private final IdGenerator idGenerator;
  private final AddressRepository addressRepository;

  void addAddress() {
    Address address = Address.builder()
        .id(idGenerator.get())
        .userId(idGenerator.get())
        .zipCode("61-001")
        .city("Poznań")
        .streetName("ul. Maratońska")
        .houseNumber("2a")
        .build();

    addressRepository.save(address);
  }

}
