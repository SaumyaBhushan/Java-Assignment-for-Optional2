package com.knoldus;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class PhoneBookCrawlerTest {

    @Test
    public void findPhoneByNameAndPunishIfNothingFoundTest(){
        PhoneBookCrawler obj = new PhoneBookCrawler();
        assertEquals( "9999999999",obj.findPhoneByNameAndPunishIfNothingFound("Saumya"));
    }

    @Test
    public void findPhoneByNameAndPunishIfNothingFoundTest2(){
        PhoneBookCrawler obj = new PhoneBookCrawler();
        assertEquals( "You are punished",obj.findPhoneByNameAndPunishIfNothingFound("Saum"));
    }

    // Test for Exercise 3

    @Test
    public void findPhoneByNameAndPrintPhoneBookIfNothingFoundTest(){
        PhoneBookCrawler obj = new PhoneBookCrawler();
        assertEquals( "9995959994",obj.findPhoneByNameAndPunishIfNothingFound("Suraj"));
    }

    @Test
    public void findPhoneByNameAndPrintPhoneBookIfNothingFoundTest2(){
        PhoneBookCrawler obj = new PhoneBookCrawler();
        assertEquals( "PhoneBook :- {Saumya=9999999999, Suraj=9995959994, Sana=9934694599, Supriya=9900002341, Samay=9959912399, Sam=9999943499}",obj.findPhoneByNameAndPrintPhoneBookIfNothingFound("Saum"));
    }

    // Test for Exercise 4

    @Test
    public void findPhoneByNameAndPrintHelloIfNothingFoundTest(){
        PhoneBookCrawler obj = new PhoneBookCrawler();
        assertEquals( "9934694599",obj.findPhoneByNameAndPrintHelloIfNothingFound("Sana"));
    }

    @Test
    public void findPhoneByNameAndPrintHelloIfNothingFoundTest2(){
        PhoneBookCrawler obj = new PhoneBookCrawler();
        assertEquals( "Hello",obj.findPhoneByNameAndPrintHelloIfNothingFound("Shreya"));
    }

    //Test for Exercise 5

    @Test
    public void findPhoneByNameAndPunishIfNothingFoundUsingStreamTest(){
        PhoneBookCrawler obj = new PhoneBookCrawler();
        assertEquals( "9999943499",obj.findPhoneByNameAndPunishIfNothingFoundUsingStream("Sam"));
    }

    @Test
    public void findPhoneByNameAndPunishIfNothingFoundUsingStreamTest2(){
        PhoneBookCrawler obj = new PhoneBookCrawler();
        assertEquals( "You are punished",obj.findPhoneByNameAndPunishIfNothingFoundUsingStream("Samridhi"));
    }

    //Test for Exercise 6

    @Test
    public void findPhoneByNameAndPrintPhoneBookIfNothingFoundUsingStreamTest(){
        PhoneBookCrawler obj = new PhoneBookCrawler();
        assertEquals( "9959912399",obj.findPhoneByNameAndPrintPhoneBookIfNothingFoundUsingStream("Samay"));
    }

    @Test
    public void findPhoneByNameAndPrintPhoneBookIfNothingFoundUsingStreamTest2(){
        PhoneBookCrawler obj = new PhoneBookCrawler();
        assertEquals( "PhoneBook :- {Saumya=9999999999, Suraj=9995959994, Sana=9934694599, Supriya=9900002341, Samay=9959912399, Sam=9999943499}",obj.findPhoneByNameAndPrintPhoneBookIfNothingFoundUsingStream("Sau"));
    }

    // Test for Exercise 7

    @Test
    public void findPhoneNumberByNameOrNameByPhoneNumberTest(){
        PhoneBookCrawler obj = new PhoneBookCrawler();
        assertEquals( "9999999999",obj.findPhoneNumberByNameOrNameByPhoneNumber("Saumya","7578586868"));
    }

    @Test
    public void findPhoneNumberByNameOrNameByPhoneNumberTest2(){
        PhoneBookCrawler obj = new PhoneBookCrawler();
        assertEquals( "Saumya",obj.findPhoneNumberByNameOrNameByPhoneNumber("Divyanshu","9999999999"));
    }

    @Test
    public void findPhoneNumberByNameOrNameByPhoneNumberTest3(){
        PhoneBookCrawler obj = new PhoneBookCrawler();
        assertEquals( "Nothing found ..Please enter a valid name or phone No",obj.findPhoneNumberByNameOrNameByPhoneNumber("Divya","99911111111"));
    }


}