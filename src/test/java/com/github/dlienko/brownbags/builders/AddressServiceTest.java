package com.github.dlienko.brownbags.builders;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;

import java.util.UUID;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AddressServiceTest {

  private static final UUID CONSTANT_ID = UUID.randomUUID();

  @Mock
  private AddressRepository addressRepository;
  @Mock
  private IdGenerator idGenerator;

  @InjectMocks
  private AddressService subject;

  @Before
  public void setUp() {
    given(idGenerator.get()).willReturn(CONSTANT_ID);
  }

  @Test
  public void should_save_address() {
    // when
    subject.addAddress();
    // then
    then(addressRepository).should().save(any());
  }

  @Test
  public void should_save_address_exact() {
    // given
    Address address = new Address(CONSTANT_ID, CONSTANT_ID, "Poznań", "61-001")
        .withStreetName("ul. Maratońska")
        .withHouseNumber("2a");

    // when
    subject.addAddress();
    // then
    then(addressRepository).should().save(address);
  }

}
