package ru.GetJSON;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
@Component
public class GetJSON implements IGetJSON {
    @Value("${GetJSON.path}")
    private String path;
    @Override
    public String get() throws IOException {
        return new String(Files.readAllBytes(Paths.get(path)));
    }
}
