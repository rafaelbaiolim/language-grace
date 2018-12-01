package unit;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import uem.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


public class TestCase {
    private final String _BC_PATH =
            "/home/rafaellb/Documents/uem/ilp2018/compilador2018/tests/assets/llvm/out.bc";

    public static final String WANTED = "wanted";
    public static final String FILE = "file";
    public static final String TYPE = "type";
    public static final String OPTIMIZELLVM = "optimize";

    public static final String EQUALS = "EQUALS";
    public static final String NOT_EQUALS = "NOT_EQUALS";


    public String getLLIResult(String file, boolean opt) throws IOException {
        this.compileCurrentCase(file, opt); //compila o caso de teste
        return this.executeLLI(); //retorna o output da lli
    }

    private void compileCurrentCase(String file, boolean opt) throws IOException {
        Main.compile(file, false, opt);
        System.gc();
    }

    private String executeLLI() throws IOException {
        String s;
        StringBuilder stringBuilder = new StringBuilder();
        Process p;
        try {
            p = Runtime.getRuntime().exec("lli " + _BC_PATH);
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


    public static HashMap<String, String> GetTag(Node node) throws IOException {
        HashMap<String, String> testCase = new HashMap<String, String>();
        if (node.getNodeType() == Node.ELEMENT_NODE) {
            Element element = (Element) node;

            String wanted = getTagValue(WANTED, element);
            testCase.put(WANTED, wanted);

            String type = getTagValue(TYPE, element);
            testCase.put(TYPE, type);

            String file = getTagValue(FILE, element);
            testCase.put(FILE, file);

            String opt = getTagValue(OPTIMIZELLVM, element);
            testCase.put(OPTIMIZELLVM, opt);
        }
        return testCase;
    }

    private static String getTagValue(String tag, Element element) {
        NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
        Node node = (Node) nodeList.item(0);
        return node.getNodeValue();
    }
}
