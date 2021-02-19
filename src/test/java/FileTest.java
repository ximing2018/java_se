import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileTest {

    @Test
    public void test1() throws IOException {
//        File readme = File.createTempFile("/test/qian", "readme");
        File readme = File.createTempFile("readme", ".txt");
        // C:\Users\Chang\AppData\Local\Temp\readme4035719641411157876.txt
        System.out.println(readme.getAbsoluteFile());
        Assert.assertNotNull(readme);
    }

    @Test
    public void test2() throws IOException {
        File tempFile = File.createTempFile("qian", ".xml", new File("."));
        System.out.println(tempFile.getAbsoluteFile());  //E:\IdeaProjects\t_javase\.\qian8383215457477993352.xml
        Assert.assertNotNull(tempFile);
    }

    @Test
    public void test3(){
        File[] files = File.listRoots();
        Arrays.stream(files).forEach(file -> System.out.println(file.getAbsoluteFile()));
    }


}
