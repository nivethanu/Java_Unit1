class DefaultValuesDemo {
    int intVar;        // default 0
    double doubleVar;  // default 0.0
    char charVar;      // default '\u0000'
    boolean boolVar;   // default false
    String strVar;     // default null

    public void show() {
        System.out.println("int: " + intVar);
        System.out.println("double: " + doubleVar);
        System.out.println("char: " + charVar);
        System.out.println("boolean: " + boolVar);
        System.out.println("String: " + strVar);
    }

    public static void main(String[] args) {
        DefaultValuesDemo obj = new DefaultValuesDemo();
        obj.show();
    }
}
