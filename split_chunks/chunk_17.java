public int METHOD_1(TYPE_1 VAR_1) {
    int VAR_2 = METHOD_2(VAR_3);
    int VAR_4 = METHOD_2(VAR_5);
    if (VAR_2 == VAR_4) {
        return (int) (Math.pow(INT_1, VAR_2) + METHOD_1(VAR_5));
    } else {
        return (int) Math.pow(INT_1, VAR_4) + METHOD_1(VAR_3);
    }
}

public synchronized void METHOD_1(TYPE_1 VAR_1, TYPE_2 VAR_2) {
    java.util.List<TYPE_2> VAR_3 = VAR_4.computeIfAbsent(VAR_1, k -> new java.util.ArrayList<>());
    VAR_3.add(VAR_2);
    System.out.println(STRING_1 + VAR_1 + STRING_2);
    if (VAR_5.METHOD_2(VAR_1)) {
        System.out.println(STRING_3);
        this.METHOD_3(new TYPE_3(VAR_1), VAR_2);
    }
}

public void METHOD_1() {
    final TYPE_1 VAR_1 = new TYPE_2(VAR_2).METHOD_2(VAR_3).build();
    TYPE_3.assertEquals(STRING_1, 0, VAR_1.METHOD_3().size());
    VAR_1.METHOD_3().add(STRING_2);
}

public void METHOD_1(TYPE_1 VAR_1) {
    this.VAR_1 = VAR_1;
    TYPE_2 VAR = null; // Incomplete code fixed with placeholder
}