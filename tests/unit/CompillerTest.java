package unit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@RunWith(Parameterized.class)
public class CompillerTest {
    /**
     * Adicionar o nome dos arquivos de teste disponiveis estaticamente aqui
     * e alterar o indice de @TESTS_XML_RELATIVE_PATH
     */
    private static final String[] XML_FILE_NAME = {
            "lote-test.xml",            //0
            "arr.xml",                  //1
            "func/atrib-param-arr.xml", //2
            "func/param.xml",           //3
            "func/arr-atrib-inside.xml",//4
            "func/bubble.xml",          //5
    };

//    private static final String TESTS_XML_RELATIVE_PATH = "tests/unit/cases/" + XML_FILE_NAME[0];
//    private static final String TESTS_XML_RELATIVE_PATH = "tests/unit/cases/" + XML_FILE_NAME[1];
//    private static final String TESTS_XML_RELATIVE_PATH = "tests/unit/cases/" + XML_FILE_NAME[2];
//    private static final String TESTS_XML_RELATIVE_PATH = "tests/unit/cases/" + XML_FILE_NAME[3];
//    private static final String TESTS_XML_RELATIVE_PATH = "tests/unit/cases/" + XML_FILE_NAME[4];
    private static final String TESTS_XML_RELATIVE_PATH = "tests/unit/cases/" + XML_FILE_NAME[5];

    private String wanted;
    private String file;
    private String fileName;
    private String type;
    private boolean opt;

    public CompillerTest(String wanted,
                         String file,
                         String type,
                         String fileName,
                         String opt
    ) {
        this.wanted = wanted;
        this.file = file;
        this.type = type;
        this.fileName = fileName;
        this.opt = Boolean.parseBoolean(opt);
    }

    @Test
    public void testFromXML() throws IOException {
        String recived = new TestCase().getLLIResult(file, opt);
        System.out.println("-> (" + fileName + "): " + recived + "\n");
        switch (type) {
            case TestCase.EQUALS:
                assertEquals(wanted.trim(), recived.trim());
                break;

            case TestCase.NOT_EQUALS:
                assertNotEquals(wanted.trim(), recived.trim());
                break;

        }
    }

    @Parameterized.Parameters(name = "{index}: {3}")
    public static Collection<String[]> testesAdded() {
        File xmlFile = new File(TESTS_XML_RELATIVE_PATH);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;
        List<String[]> tests = new LinkedList<>();
        try {
            dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();
            NodeList nodeList = doc.getElementsByTagName("test");
            for (int i = 0; i < nodeList.getLength(); i++) {
                HashMap<String, String> current =
                        TestCase.GetTag(nodeList.item(i));
                String[] formatedCurrentCase = new String[]{
                        current.get(TestCase.WANTED),
                        current.get(TestCase.FILE),
                        current.get(TestCase.TYPE),
                        new File(current.get(TestCase.FILE)).getName(),
                        current.get(TestCase.OPTIMIZELLVM),
                };
                tests.add(formatedCurrentCase);
            }

        } catch (SAXException | ParserConfigurationException | IOException e1) {
            e1.printStackTrace();
        }
        return tests;
    }


}