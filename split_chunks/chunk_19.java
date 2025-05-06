public final void METHOD_1(java.lang.String VAR_1, java.lang.String VAR_2) {
    METHOD_2(VAR_1);
    METHOD_2(VAR_2);
    VAR_1 = METHOD_3(VAR_1);
    VAR_2 = METHOD_3(VAR_2);
    java.util.Set<TYPE_1> VAR_3 = METHOD_4(VAR_1);
    java.util.Set<TYPE_1> VAR_4 = METHOD_4(VAR_2);
    TYPE_2<java.util.Set<TYPE_1>> VAR_5 = new TYPE_2<>(VAR_3, VAR_4);
    VAR_6.add(VAR_5);
}

public boolean METHOD_1(java.lang.String VAR_1) {
    for (int VAR_2 = 0; VAR_2 < VAR_3.length; VAR_2++) {
        if (VAR_3[VAR_2].length > 0 && VAR_3[VAR_2][0].toString().equals(VAR_1)) {
            return true;
        }
    }
    return false;
}

public void METHOD_1(java.lang.String VAR_1, TYPE_1 VAR_2) {
    if (!METHOD_2(VAR_1)) {
        VAR_3.put(VAR_1, VAR_2);
        VAR_4.add(VAR_2.METHOD_3().toString());
    } else {
        java.lang.System.out.println(STRING_1);
    }
}