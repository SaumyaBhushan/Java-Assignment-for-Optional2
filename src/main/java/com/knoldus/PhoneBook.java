/**
 * @author Saumya
 * @version 1.0
 */
package com.knoldus;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PhoneBook {
    /**
     * Creating phoneBook Map.
     */
    private final Map<String, String> phoneBookMap = new HashMap<>();

    {
        phoneBookMap.put("Saumya", "9999999999");
        phoneBookMap.put("Suraj", "9995959994");
        phoneBookMap.put("Sam", "9999943499");
        phoneBookMap.put("Samay", "9959912399");
        phoneBookMap.put("Sana", "9934694599");
        phoneBookMap.put("Supriya", "9900002341");

    }

    /**
     * @return phoneBookMap
     */
    public Map<String, String> getPhoneBookMap() {
        return phoneBookMap;
    }

    //Exercise 1

    /**
     * @param name
     * @return phone of respective phone no
     */
    public Optional<String> findPhoneByName(final String name) {
        String phoneNumber = getPhoneBookMap().get(name);
        return Optional.ofNullable(phoneNumber);
    }

    //Exercise7

    /**
     * @param phoneNumber
     * @return Name related to respective phone no present in phoneBookMap
     */
    public Optional<String> findNameByPhoneNumber(final String phoneNumber) {
        for (Map.Entry<String, String> entry : getPhoneBookMap().entrySet()) {
            if (entry.getValue().equals(phoneNumber)) {
                return Optional.of(entry.getKey());
            }
        }
        return Optional.empty();
    }

    /**
     * @return phoneBookMap in String Format
     */
    @Override
    public String toString() {
        return "PhoneBook :- " + getPhoneBookMap();
    }

}
