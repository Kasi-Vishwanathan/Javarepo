public void METHOD_1() {
    TYPE_1.assertThat(
        TYPE_2.METHOD_2(
            (VAR_1 - ((INT_1 * INT_2 * INT_3 * INT_4) * INT_4)),
            VAR_1,
            false,
            VAR_2
        ),
        TYPE_3.METHOD_3(METHOD_4(VAR_3, INT_1))
    );
}

public void METHOD_1(final TYPE_1 VAR_1) {
    final String VAR_2 = VAR_1.getString("id");
    TYPE_2<TYPE_3> VAR_3 = new TYPE_2<TYPE_3>(VAR_4, VAR_5) {
        @Override
        public void METHOD_2() throws TYPE_3 {
            TYPE_4 VAR_6 = VAR_7.get(VAR_2);
            VAR_6.METHOD_1();
            VAR_8.METHOD_3();
        }
    };
    VAR_8.METHOD_4(VAR_3);
}

public int METHOD_1() {
    int result = super.METHOD_1();
    result = INT_1 * result + java.util.Objects.hashCode(VAR_1);
    result = INT_1 * result + java.util.Objects.hashCode(VAR_2);
    return result;
}

public void METHOD_1() throws java.lang.Exception {
    TYPE_1 VAR_1 = new TYPE_1();
    TYPE_2.METHOD_2(null, VAR_1);
    TYPE_3 VAR_2 = new TYPE_3(VAR_1);
    TYPE_2.METHOD_2(null, VAR_2);
    VAR_2.METHOD_3("STR");
}