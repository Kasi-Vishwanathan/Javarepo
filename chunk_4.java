protected void METHOD_1(TYPE_1 VAR_1) {
    super.METHOD_1(VAR_1);
    METHOD_2(VAR_2);
    TYPE_2 VAR_3 = new TYPE_2();
    TYPE_3 VAR_4 = new TYPE_3();
    VAR_4.METHOD_3(this);
    VAR_5 = VAR_4;
    METHOD_4(VAR_4, VAR_3);
    VAR_6 = (TYPE_4) METHOD_5(VAR_7);
    VAR_6.METHOD_6(VAR_8, VAR_6.METHOD_7(VAR_9), VAR_10);
    VAR_11 = 0.0F;
    VAR_12 = VAR_13;
    VAR_14 = VAR_13;
}

public void METHOD_1() {
    VAR_1.METHOD_2(VAR_2, 0);
    VAR_1.METHOD_3(VAR_2);
    if (VAR_1.METHOD_4(VAR_2) == 0) {
        TYPE_1 response = METHOD_5(VAR_1, VAR_2);
        if (response == null || TYPE_2.METHOD_6(response)) {
            VAR_1.METHOD_3(VAR_2);
        }
        METHOD_7();
    }
}

@Override
public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(STRING_1).append(this.METHOD_1()).append(STRING_2);
    if (value.length > 0) {
        sb.append(String.valueOf(value[0]));
        for (int i = 1; i < value.length; i++) {
            sb.append(STRING_3).append(value[i]);
        }
    }
    return sb.toString();
}