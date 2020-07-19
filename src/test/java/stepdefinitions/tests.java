package stepdefinitions;

import models.CsvBean;
import models.VehiculoBean;
import org.junit.Test;
import utils.CsvReader;

import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class tests {

    @Test
    public void csvToBean() throws Exception {
        CsvReader csvReader = new CsvReader();
        Path path = Paths.get(ClassLoader.getSystemResource("data/Vehiculo.csv").toURI());
        //List<VehiculoBean> vehiculos = csvReader.beanBuilderExample(path, VehiculoBean.class);

        for (CsvBean vehiculo: csvReader.beanBuilderExample(path, VehiculoBean.class)) {
            System.out.println(vehiculo.toString());
        }

    }
}
