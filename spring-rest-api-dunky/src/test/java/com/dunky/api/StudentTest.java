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
                    new File("data/sample-lite.json"), Student.class);

            // Print out the last name and first name.
            System.out.println("\nFirst name: " +theStudent.getFirstName());
            System.out.println("Last name: " +theStudent.getLastName());

        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}
