import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.InputStream;

public class ReadJsonFile {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        InputStream inputStream = ReadJsonFile.class.getClassLoader().getResourceAsStream("student.json");
        Student student = mapper.readValue(inputStream, Student.class);
        System.out.println(student.toString());
    }
}
