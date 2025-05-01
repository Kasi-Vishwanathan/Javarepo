private java.util.List<TYPE_1> METHOD_1(final TYPE_2 VAR_1, final String VAR_2) throws TYPE_3, TYPE_4, TYPE_5 {
    java.util.List<TYPE_1> VAR_3 = new java.util.ArrayList<>();
    final TYPE_6 id = TYPE_7.METHOD_2(VAR_1, VAR_2);
    VAR_1.METHOD_3().add(id);
    for (TYPE_1 commit : VAR_1.METHOD_4()) {
        VAR_3.add(commit);
    }
    return VAR_3;
}

protected java.lang.Object METHOD_1(TYPE_1 VAR_1, TYPE_1 VAR_2, byte VAR_3, byte VAR_4, byte VAR_5, byte VAR_6, byte VAR_7, byte VAR_8) {
    return METHOD_2(VAR_1, VAR_2, VAR_3, VAR_4, VAR_5, VAR_6, VAR_7, VAR_8, true);
}

public void update() {
    if (METHOD_1() || METHOD_2()) {
        VAR_1 += VAR_2;
    }
    if (METHOD_3()) {
        VAR_3 += VAR_4;
        VAR_4 += INT_1;
    }
    if (VAR_3 >= VAR_5) {
        VAR_6 = false;
        VAR_4 = 0;
    }
}

public void METHOD_1(TYPE_1 VAR_1) {
    VAR_2 = VAR_1;
    METHOD_2(VAR_1);
    if (METHOD_3() != null) {
        METHOD_4();
    }
    TYPE_2.METHOD_5().METHOD_6(VAR_2);
}