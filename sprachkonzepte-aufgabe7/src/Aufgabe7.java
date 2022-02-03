import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroupFile;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Method;
import java.util.ArrayList;

public final class Aufgabe7 {
    private Aufgabe7() {
    }

    public static void main(String[] args) throws Exception {

        ArrayList<ClassesAndInterfaces> classList = new ArrayList<ClassesAndInterfaces>();
        String[] testCases = {"java.lang.String", "java.util.Iterator", "java.time.Month", "java.io.File"};

        for (String testcase : testCases) {
            Class<?> classforName = Class.forName(testcase);
            ClassesAndInterfaces classes = new ClassesAndInterfaces(classforName.getName(), classforName);
            classList.add(classes);
        }

        // Render HTML File
        ST template = new STGroupFile(args[0]).getInstanceOf("classesAndInterfaces");
        template.add("classes", classList);
        String result = template.render();

        // Create and write to HTML File
        new File("src/aufgabe7.html");
        FileWriter myWriter = new FileWriter("src/aufgabe7.html");
        myWriter.write(result);
        myWriter.close();
    }
}

final class ClassesAndInterfaces {
    public String classesAndInterfaceName;
    public ArrayList<Methods> interfaces = new ArrayList<>();
    public Method[] methods;
    public boolean isClass = true;

    public ClassesAndInterfaces(String name, Class<?> classObject) {
        if (classObject.toString().contains("interface")) {
            this.classesAndInterfaceName = name;
            isClass = false;
            this.methods = classObject.getMethods();
        } else {
            this.classesAndInterfaceName = name;
            for (Class<?> c : classObject.getInterfaces())
                interfaces.add(new Methods(c.getName(), c.getMethods()));
        }
    }
}

final class Methods {
    public String interfaceName;
    public Method[] interfaceMethods;

    public Methods(String interfaceName, Method[] interfaceMethods) {
        this.interfaceName = interfaceName;
        this.interfaceMethods = interfaceMethods;
    }
}
