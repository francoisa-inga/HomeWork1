package HomeWorkLesson1.Task1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class Shuffle {
    public void xShuffle() {
        int x=3;
        while(x>0) {
            if (x > 2) {
                System.out.print("a");
            }

            if (x == 2) {
                System.out.print("b  c");
            }
            if (x == 1) {
                System.out.print("d");
                x = x - 1;
            }
            x = x - 1;
            System.out.print("-");
        }
    }
}
