public java.lang.String METHOD_1(java.lang.String VAR_1) {
    java.lang.String out;
    try {
        out = TYPE_1.METHOD_2(VAR_1, VAR_2)
                .replace(STRING_1, STRING_2)
                .replace(STRING_3, STRING_4)
                .replace(STRING_5, STRING_6);
    } catch (TYPE_2 ignored) {
        out = VAR_1;
    }
    return out;
}

public boolean METHOD_1(TYPE_1 VAR_1) {
    VAR_1 = new TYPE_2(VAR_1.METHOD_2());
    if (VAR_2.get()) {
        return false;
    }
    if (!VAR_3.METHOD_3(VAR_1, this)) {
        VAR_4.set(true);
        METHOD_4();
    }
    return VAR_5.METHOD_1(VAR_1);
}

private void METHOD_1(java.util.ArrayList<TYPE_1> VAR_1, java.util.ArrayList<TYPE_1> VAR_2) {
    if (VAR_1 == null || VAR_1.isEmpty()) {
        return;
    }
    TYPE_2<TYPE_1> VAR_3 = METHOD_2(VAR_1);
    java.util.ArrayList<TYPE_1> VAR_4 = new java.util.ArrayList<>(VAR_2);
    if (VAR_5) {
        METHOD_3(VAR_3, VAR_4);
        METHOD_4(VAR_3, VAR_4);
        METHOD_5(VAR_3, VAR_4);
        METHOD_6(VAR_3, VAR_4);
    }
}