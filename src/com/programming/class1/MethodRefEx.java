package com.programming.class1;

public class MethodRefEx {

    interface Converter<F, T> {
        T convert(F from);
    }

    public static void main(String[] args) {

        Converter<String, Integer> intConverter = (from) -> Integer.valueOf(from);
        Integer convertedValue = intConverter.convert("123");
        System.out.println("integer value is " + convertedValue);

        Converter<String, Integer> intConverterUsingMR = Integer::valueOf;
        Integer convertedValue2 = intConverterUsingMR.convert("456");
        System.out.println("integer value using method reference is " + convertedValue2);

        Converter<String, String> stringConverterUsingMR = StringOperation::startsWith;
        String convertedValue3 = stringConverterUsingMR.convert("Method Reference");
        System.out.println("string value using method reference is " + convertedValue3);

        PersonFactory<Person> personFactory = Person::new;
        Person person = personFactory.create("ABC", "XYZ");
        System.out.println(person.firstName + " " + person.lastName);

    }

    static class StringOperation {
        static String startsWith(String s) {
            return String.valueOf(s.charAt(0));
        }
    }

    interface PersonFactory<P extends Person> {
        P create(String firstName, String lastName);
    }

    static class Person {
        public String firstName;
        public String lastName;

        public Person() {}

        public Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName; // Corrected here
        }
    }

}
