public void METHOD_1(TYPE_1 VAR_1, final TYPE_2 VAR_2) {
    final int typeCode = VAR_1.getInt("type");
    TYPE_3 VAR_3 = TYPE_4.METHOD_2().METHOD_3(typeCode);
    if (VAR_3 == null) {
        VAR_2.METHOD_4(STRING_1);
        return;
    }
    VAR_2.METHOD_5(TYPE_4.METHOD_2().METHOD_6(typeCode));
}

private boolean METHOD_1(TYPE_1 VAR_1, boolean add) {
    return VAR_1 != null && METHOD_2(
        add,
        VAR_1.METHOD_3(),
        VAR_1.METHOD_4(),
        null,
        null,
        VAR_1.METHOD_5(),
        null,
        null,
        null,
        VAR_1,
        null
    );
}

public void METHOD_1() throws TYPE_1 {
    TYPE_2 VAR_1 = TYPE_3.METHOD_2(0, INT_1, 0, 0, STRING_1);
    VAR_1.METHOD_3();
    METHOD_4(VAR_1, INT_1, INT_1, 0, 0);
    
    VAR_1 = TYPE_3.METHOD_2(0, INT_1, 0, 0, STRING_2);
    VAR_1.METHOD_3();
    METHOD_4(VAR_1, INT_2, INT_1, 0, 0);
}

private static java.util.List<java.lang.Integer> METHOD_1(int n) {
    java.util.List<java.lang.Integer> VAR_1 = new java.util.ArrayList<>();
    if (n == 1) {
        // Implementation logic here
    }
    return VAR_1;
}