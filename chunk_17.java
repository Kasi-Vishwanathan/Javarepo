public static TYPE_1 METHOD_1(TYPE_2 VAR_1, java.lang.String values, java.lang.String VAR_2, java.lang.String VAR_3) {
    java.util.List<TYPE_3> VAR_4 = TYPE_2.METHOD_2(VAR_1, STRING_1, VAR_2, VAR_3);
    TYPE_1 VAR_7 = null;
    if (VAR_4.size() == INT_1) {
        VAR_7 = TYPE_4.METHOD_3(VAR_1, VAR_4.get(0), VAR_4.get(1), values, VAR_2, VAR_3);
    }
    return VAR_7;
}

public void METHOD_1(long VAR_1) {
    TYPE_1 VAR_2 = METHOD_2();
    if (VAR_2 != null) {
        TYPE_2 VAR_3 = TYPE_2.METHOD_3(VAR_1, this);
        VAR_2.METHOD_4().add(VAR_4, VAR_3, SomeClass.class.getName()).commit();
    }
}

public void METHOD_1() {
    TYPE_1 a = TYPE_2.METHOD_2(SomeClass.class);
    TYPE_1 b = TYPE_2.METHOD_3(a);
    TYPE_3.assertTrue(TYPE_2.METHOD_4(a).METHOD_5());
    TYPE_3.METHOD_6(TYPE_2.METHOD_4(a).METHOD_7());
    TYPE_3.METHOD_6(TYPE_2.METHOD_4(b).METHOD_5());
    TYPE_3.assertTrue(TYPE_2.METHOD_4(b).METHOD_7());
}