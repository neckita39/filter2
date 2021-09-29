package ru.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import ru.*;
import ru.Filter.Filter;
import ru.Pack.Pack;
@Component
public class Parse {
    @Autowired
    Filter f=new Filter();
    @Autowired
    Pack p=new Pack();
    @Bean
    public void parseFile(){
        System.out.println(f.filtred(p.pack()));
    }
}
