public void method1(TYPE_1 event) throws java.io.IOException {
    java.lang.System.out.println(STRING_1);
    int i;
    try {
        i = java.lang.Integer.parseInt(textField.getText());
    } catch (java.lang.NumberFormatException e) {
        // Log exception or handle appropriately
        return;
    }
    method2();
    method3();
    method4(i);
    method5(i);
}

protected void method1() {
    super.method1();
    boolean flag = true;
    method2(var2, new TYPE_1(VAR_3));
    TYPE_1 var4 = new TYPE_1();
    var4.method3(VAR_5);
    var4.method3(VAR_6);
    method2(VAR_7, var4);
    boolean var8 = VAR_9.method4();
    TYPE_2.method5(STRING_1, (STRING_2 + var8));
    method6(STRING_3);
}

public static boolean method1(java.lang.String fileName, java.lang.String var1) {
    if (var2.method2() == null) {
        TYPE_1 var3 = new TYPE_2();
        var2.method3(var3);
    }
    try (TYPE_3 file = new TYPE_3(fileName)) {
        java.lang.System.out.println(var1);
        file.method4(TYPE_4.method5(var1));
        return var2.method6();
    } catch (java.io.IOException e) {
        // Handle exception
        return false;
    }
}