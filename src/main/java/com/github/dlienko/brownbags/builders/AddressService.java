package com.github.dlienko.brownbags.builders;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class AddressService {

  private final IdGenerator idGenerator;
  private final AddressRepository addressRepository;

  void addAddress() {
    Address address = new Address(idGenerator.get(), idGenerator.get(), "61-001", "Poznań")
        .withStreetName("ul. Maratońska")
        .withHouseNumber("2a");

    addressRepository.save(address);
  }

}
