import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class WritePojoToFile {
    public static void main(String[] args) {
        Student student = new Student(100,"Thomas",true);
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File("student.json"), student);
            System.out.println("JSON file created successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
