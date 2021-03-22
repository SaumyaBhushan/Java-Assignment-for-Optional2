/**
 * @author Saumya
 * @version 1.0
 */
package com.knoldus;


import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PhoneBookCrawler {
    //Exercise 2
    /**
     *
     * @param name
     * @return Phone no of input name else returns You are punished
     */
    public String findPhoneByNameAndPunishIfNothingFound(final String name) {
        PhoneBook phoneBookObj = new PhoneBook();
        return phoneBookObj.findPhoneByName(name).orElse("You are punished");
    }

    //Exercise 3

    /**
     *
     * @param name
     * @return Phone no of input name else returns Phonebook Map in string format if the name is not found in String
     */
    public String findPhoneByNameAndPrintPhoneBookIfNothingFound(final String name) {
        PhoneBook phoneBookObj = new PhoneBook();
        return phoneBookObj
                .findPhoneByName(name)
                .orElse(phoneBookObj.toString());
    }
    //Exercise 4

    /**
     *
     * @return whether toString() returns Hello or not
     */
    boolean checkHelloMessage() {
        PhoneBook phoneBookObj = new PhoneBook();
        return phoneBookObj.toString().equals("Hello");
    }


    /**
     *
     * @param name
     * @return phone no according to name in phoneBookMap else returns Hello
     */
    public String findPhoneByNameAndPrintHelloIfNothingFound(final String name) {
        PhoneBook phoneBookObj = new PhoneBook();
        return (checkHelloMessage()) ? phoneBookObj.findPhoneByName(name).orElseGet(() -> phoneBookObj.toString()) : phoneBookObj.findPhoneByName(name).orElse("Hello");

    }

    //Exercise 5

    /**
     *
     * @param name
     * @return Phone no of input name else returns You are punished
     */
    public String findPhoneByNameAndPunishIfNothingFoundUsingStream(final String name) {
        PhoneBook phoneBookObj = new PhoneBook();
        Map<String, String> phoneBookMap = phoneBookObj.getPhoneBookMap();
        String result = phoneBookMap.entrySet().stream()
                .filter(map -> name.equals(map.getKey()))
                .map(Map.Entry::getValue)
                .collect(Collectors.joining());
        return (result.equals("")) ? "You are punished" : result;

    }

    //Exercise 6
    /**
     *
     * @param name
     * @return Phone no of input name else returns Phonebook Map in string format if the name is not found in String
     */
    public String findPhoneByNameAndPrintPhoneBookIfNothingFoundUsingStream(final String name) {
        PhoneBook phoneBookObj = new PhoneBook();
        Map<String, String> phoneBookMap = phoneBookObj.getPhoneBookMap();
        String result = phoneBookMap.entrySet().stream()
                .filter(map -> name.equals(map.getKey()))
                .map(Map.Entry::getValue)
                .collect(Collectors.joining());
        return (result.equals("")) ? phoneBookObj.toString() : result;
    }
    //Exercise 7
    /**
     * @param name
     * @param phoneNo
     * @return phoneNo if name is found in phoneBookMap else returns Name if phone No is found or else returns Not found
     */
    public String findPhoneNumberByNameOrNameByPhoneNumber(final String name, final String phoneNo) {

        PhoneBook phoneBookObj = new PhoneBook();
        Optional<String> str =  Stream.of(phoneBookObj.findPhoneByName(name), phoneBookObj.findNameByPhoneNumber(phoneNo))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .findFirst();
        return (str.isPresent()) ? str.get() : "Nothing found ..Please enter a valid name or phone No";

    }
}


