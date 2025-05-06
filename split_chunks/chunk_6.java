public static boolean METHOD_1(int index) {
    if (index == -1 || index >= VAR_1.length || VAR_1[index] == null) {
        return false;
    }
    VAR_1[index].METHOD_2(VAR_2, true);
    TYPE_1.METHOD_3(index);
    return true;
}

private void METHOD_1(final TYPE_1 msg) {
    if (msg instanceof TYPE_2) {
        TYPE_2 VAR_1 = (TYPE_2) msg;
        VAR_1.METHOD_2(METHOD_3());
        parameters = VAR_1.METHOD_4(parameters);
        VAR_2 = VAR_1.METHOD_5();
    } else {
        if (!VAR_3 && msg != null) {
            msg.METHOD_6();
        }
        this.message = msg;
    }
}

private TYPE_1 METHOD_1(String str, int i) {
    try {
        java.net.URL url = new java.net.URL(str);
        java.io.File VAR_1 = METHOD_2(url);
        return METHOD_3(i, VAR_1.METHOD_4());
    } catch (TYPE_2 e) {
        e.METHOD_5();
    } catch (java.io.IOException ex) {
        ex.METHOD_5();
    }
    return null;
}

private void init() {
    for (int i = 1; i <= VAR_1; i++) {
        VAR_2.add(new TYPE_1(i));
    }
    VAR_3 = new java.util.ArrayList<>();
}