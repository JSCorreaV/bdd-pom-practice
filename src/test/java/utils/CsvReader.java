package utils;


import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import models.CsvBean;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {

    public List<String[]> readAll(Reader reader) throws Exception {
        CSVReader csvReader = new CSVReader(reader);
        List<String[]> list = new ArrayList<>();
        list = csvReader.readAll();
        reader.close();
        csvReader.close();
        return list;
    }

    public List<String[]> oneByOne(Reader reader) throws Exception {
        List<String[]> list = new ArrayList<>();
        CSVReader csvReader = new CSVReader(reader);
        String[] line;
        while ((line = csvReader.readNext()) != null) {
            list.add(line);
        }
        reader.close();
        csvReader.close();
        return list;
    }

    public List<CsvBean> beanBuilderExample(Path path, Class clazz) throws Exception {
        Reader reader = Files.newBufferedReader(path);
        ColumnPositionMappingStrategy ms = new ColumnPositionMappingStrategy();
        ms.setType(clazz);
        CsvToBean cb = new CsvToBeanBuilder(reader)
                .withType(clazz)
                .withMappingStrategy(ms)
                .build();
        List<CsvBean> data = cb.parse();
        reader.close();
        return data;
    }

//        public String simplePositionBeanExample() throws Exception {
//            Path path = Paths.get(
//                    ClassLoader.getSystemResource("csv/twoColumn.csv").toURI());
//            return CsvReader.beanBuilderExample(path, VehiculoBean.class).toString();
//        }


//        public String readAllExample() throws Exception {
//            Reader reader = Files.newBufferedReader(Paths.get(
//                    ClassLoader.getSystemResource("csv/twoColumn.csv").toURI()));
//            return CsvReader.readAll(reader).toString();
//        }

//        public String oneByOneExample() throws Exception {
//            Reader reader = Files.newBufferedReader(Paths.get(
//                    ClassLoader.getSystemResource("csv/twoColumn.csv").toURI()));
//            return CsvReaderExamples.oneByOne(reader).toString();
//        }

//        CSVParser parser = new CSVParserBuilder()
//                .withSeparator(',')
//                .withIgnoreQuotations(true)
//                .build();
//
//        CSVReader csvReader = new CSVReaderBuilder(reader)
//                .withSkipLines(0)
//                .withCSVParser(parser)
//                .build();
}
