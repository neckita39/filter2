package ru.Pack;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.Person.Person;
import ru.GetJSON.GetJSON;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
@Component
public class Pack implements IPack {
    private Type personsList=new TypeToken<List<Person>>(){}.getType();
    @Autowired
    private GetJSON getJSON=new GetJSON();
    @Override
    public List<Person> pack(){
        Gson gson=new Gson();
        String json=new String();
        try{
            json=getJSON.get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return gson.fromJson(json, personsList);
    }
}
