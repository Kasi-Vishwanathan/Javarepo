public TYPE_1 METHOD_1(double VAR_1) {
    if (VAR_1 == 0.0) {
        return new TYPE_1(size);
    }
    TYPE_1 result = new TYPE_1(size);
    for (int i : VAR_2) {
        result.set(i, data[i] * VAR_1);
    }
    return result;
}

public static double METHOD_1(int i, double[] p, double[] VAR_1) {
    double VAR_2 = 0;
    for (int VAR_3 = 0; VAR_3 < p.length; VAR_3++) {
        double VAR_4 = p[i] * VAR_1[VAR_3];
        VAR_2 += TYPE_1.METHOD_2(VAR_4);
    }
    return VAR_2;
}

private TYPE_1 METHOD_1() {
    String VAR_1 = null;
    try {
        VAR_1 = TYPE_2.METHOD_2().METHOD_3(STRING_1);
    } catch (Exception ignored) {
        // Exception handling or logging recommended
    }
    if (VAR_1 == null) {
        VAR_1 = STRING_2;
    }
    return new TYPE_1(VAR_1);
}

public static boolean METHOD_1(List<?> VAR_1) {
    for (Object text : VAR_1) {
        if (!(text instanceof TYPE_1)) {
            return false;
        }
        String string = ((TYPE_1) text).getText();
        if (string.isEmpty()) {
            return false;
        }
    }
    return true;
}