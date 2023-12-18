package messaging;
//java
import java.io.*;
import java.util.Map;
//yaml
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

public class PortMap{
    public Map<String, Service> services;
    public PortMap load(){
        Yaml yaml = new Yaml(new Constructor(PortMap.class));
        PortMap portmap;
        InputStream inputStream = PortMap.class.getResourceAsStream("/services.yaml");
        portmap = (PortMap) yaml.load(inputStream);
        try {
            inputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return portmap;
    }
}
