public void METHOD_1() {
    final var localVar = VAR_1;
    localVar.METHOD_2(result -> {
        if (!result.METHOD_4()) {
            METHOD_5(STRING_1 + result);
            return;
        }
        if (localVar == null) return;
        localVar.METHOD_6(VAR_2);
    });
}

public boolean METHOD_1(TYPE_1 target, TYPE_2 VAR_1, double VAR_2) {
    final TYPE_3 VAR_3 = new TYPE_3(VAR_1, target, VAR_4, VAR_2);
    TYPE_4.METHOD_2().METHOD_3(VAR_3);
    if (!VAR_3.METHOD_4()) {
        target.METHOD_5(VAR_2);
        return true;
    }
    return false;
}

public TYPE_1<?> METHOD_1() {
    if (TYPE_2.METHOD_2(TYPE_3.METHOD_3())) {
        return TYPE_4.METHOD_1(VAR_1, TYPE_3.METHOD_3());
    } else {
        final TYPE_4 result = METHOD_4();
        if (result != null) {
            TYPE_1<?> t = result.METHOD_5();
            METHOD_6(t);
            return t;
        }
    }
    return null;
}

public void METHOD_1() {
    TYPE_1<?> VAR_1 = new TYPE_1<>(STRING_1);
    java.util.List<TYPE_2> results = VAR_2.query(VAR_1);
    assertEquals(INT_1, results.size(), "Unexpected result size");
}