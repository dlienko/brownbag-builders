package com.github.dlienko.brownbags.builders;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.then;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AddressServiceTest {

  @Mock
  private AddressRepository addressRepository;

  @InjectMocks
  private AddressService subject;

  @Test
  public void should_save_address() {
    // when
    subject.addAddress();
    // then
    then(addressRepository).should().save(any());
  }

}
