import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;

public class ReadJsonArrayFile {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        InputStream inputStream = ReadJsonArrayFile.class.getClassLoader().getResourceAsStream("students.json");
        Student[] students = mapper.readValue(inputStream, Student[].class);
        for (Student student : students){
            System.out.println(student);
        }
    }
}
