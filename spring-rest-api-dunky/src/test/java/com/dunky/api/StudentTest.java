package com.dunky.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;

@SpringBootTest
public class StudentTest {

    @Test
    void printStudent(){
        try {
            // Create object mapper.
            ObjectMapper mapper = new ObjectMapper();

            // Read JSON file and map/covert it to Java POJO: data/sample-lite.json.
            Student theStudent = mapper.readValue(
                    new File("data/sample-full.json"), Student.class);

            // Print out the last name and first name.
            System.out.println("\n=========================");
            System.out.println("REST JSON - MANIPULATION");
            System.out.println("=========================");
            System.out.println("\nFirst name: " +theStudent.getFirstName());
            System.out.println("Last name: " +theStudent.getLastName());

            // Print out the address: street and city
            Address tempAddress = theStudent.getAddress();
            System.out.println("\nStudent city is: " + tempAddress.getCity() +
                             " and student street is: " + tempAddress.getStreet());
            System.out.println("======================================================\n");

            // Print out languages
            for(String tempLang: theStudent.getLanguages()){
                System.out.println(tempLang);
            }

        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}
