package unit;

import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import uem.Main;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CompillerTest {
    protected void assertResults(HashMap<String, String> tests) throws IOException {

        String recived = tests.get("recived");
        String wanted = tests.get("wanted");
        String typeTest = tests.get("type");

        System.out.println("Esperado.:" + wanted);
        System.out.println("Recebido.:" + recived);

        switch (typeTest) {
            case "EQUALS":
                assertEquals(recived, wanted);
                break;
            case "NOT_EQUALS":
                assertNotEquals(recived, wanted);
                break;
        }
        System.out.println("\n");
    }


    @Test
    public void testFromFiles() throws IOException, ParserConfigurationException, SAXException {
        File xmlFile = new File("tests/unit/cases/tests.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;
        try {
            dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();
            NodeList nodeList = doc.getElementsByTagName("test");
            for (int i = 0; i < nodeList.getLength(); i++) {
                executeTest(nodeList.item(i));
            }

        } catch (SAXException | ParserConfigurationException | IOException e1) {
            e1.printStackTrace();
        }
    }

    private void executeTest(Node node) throws IOException {
        if (node.getNodeType() == Node.ELEMENT_NODE) {
            HashMap<String, String> testCase = new HashMap<String, String>();

            Element element = (Element) node;
            String wanted = getTagValue("wanted", element);
            String type = getTagValue("type", element);
            testCase.put("wanted", wanted);
            testCase.put("type", type);

            String file = getTagValue("file", element);
            Main.compile(file, false, false);
            String recived = executeLLI();
            if (recived != null) {
                System.out.println("Executando.:" + new File(file).getName());
                testCase.put("recived", recived);
                this.assertResults(testCase);
            }
        }
    }

    private static String executeLLI() throws IOException {
        String s;
        StringBuilder stringBuilder = new StringBuilder();
        Process p;
        try {
            p = Runtime.getRuntime().exec("lli /home/rafaellb/Documents/uem/ilp2018/compilador2018/tests/assets/llvm/out.bc");
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(p.getInputStream()));
            while ((s = br.readLine()) != null)
                stringBuilder.append(s);
            p.waitFor();
            p.destroy();
        } catch (Exception e) {
        }

        return stringBuilder.toString();
    }

    private static String getTagValue(String tag, Element element) {
        NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
        Node node = (Node) nodeList.item(0);
        return node.getNodeValue();
    }


}