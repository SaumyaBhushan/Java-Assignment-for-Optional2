package com.knoldus;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {
    // Test for Exercise 1
    @Test
    public void findPhoneByNameTest (){
        PhoneBook obj = new PhoneBook();
        assertEquals(Optional.of("9999999999"),obj.findPhoneByName("Saumya"));
    }

    @Test
    public void findPhoneByNameTestForThoseValueDoesNotExist(){
        PhoneBook obj = new PhoneBook();
        assertEquals(Optional.empty(),obj.findPhoneByName("Sama"));
    }

    // Test for Exercise 7

    @Test
    public void findNameByPhoneNumberTest (){
        PhoneBook obj = new PhoneBook();
        assertEquals(Optional.of("Suraj"),obj.findNameByPhoneNumber("9995959994"));
    }

    @Test
    public void findNameByPhoneNumberTest2(){
        PhoneBook obj = new PhoneBook();
        assertEquals(Optional.empty(),obj.findNameByPhoneNumber("Sarvesh"));
    }

}