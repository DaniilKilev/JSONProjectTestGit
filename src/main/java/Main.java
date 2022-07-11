import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main  {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        SomeData someData = new SomeData(100,true,"asd");
        SomeData someData2 = new SomeData(150,false,"Daniil");
        String result = mapper.writeValueAsString(someData);
        System.out.println(result.concat(mapper.writeValueAsString(someData2)));


        SomeData test1 = mapper.readValue(new File("SomeData.json"), SomeData.class);
        System.out.println(test1.toString());

    }
}
