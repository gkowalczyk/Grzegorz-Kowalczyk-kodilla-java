package Serializaton;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@Data
@ToString
public class MyObject implements Serializable {
    private String name;
    private List<String> objectList;
}
