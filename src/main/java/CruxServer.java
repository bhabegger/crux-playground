import clojure.java.api.Clojure;
import clojure.lang.IFn;

import java.io.File;
import java.io.FileFilter;
import java.util.concurrent.Callable;

public class CruxServer {
    public static void main(String[] args) throws Exception {
        IFn require = Clojure.var("clojure.core", "require");
        require.invoke(Clojure.read("cruxServer"));

        IFn crux = Clojure.var("cruxServer", "crux");
        System.out.println(crux);
    }
}
