package com.github.dlienko.brownbags.builders;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class AddressService {

  private final IdGenerator idGenerator;
  private final AddressRepository addressRepository;

  void addAddress() {
    Address address = Address.builder(idGenerator.get(), idGenerator.get(),"61-001","Poznań")
        .streetName("ul. Maratońska")
        .houseNumber("2a")
        .build();

    addressRepository.save(address);
  }

}
