package epam.input_output;

import jdk.nashorn.internal.objects.annotations.Property;

import java.util.Properties;

public class PropDemo {
    public static void main(String[] args) {
        Properties property = System.getProperties();
        property.list(System.out);
    }
}
