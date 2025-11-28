class TypeCastingDemo {
    public static void main(String[] args) {
        int num = 10;
        double d = num; // implicit casting (int to double)
        System.out.println("Implicit Casting: " + d);

        double value = 9.78;
        int val = (int) value; // explicit casting (double to int)
        System.out.println("Explicit Casting: " + val);
    }
}
