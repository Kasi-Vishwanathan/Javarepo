private void method1(int index) {
    Type1 info = var1.get(index);
    if (info == null) {
        Type2.method2(this, "STRING_1", var2).show();
    } else if (var3.getBoolean("VAR_4", false)) {
        if (var5.method3().method4().equals("VAR_6")) {
            method1(1);
        }
    } else {
        method5(info);
    }
}

public void setValue(double value) {
    if (value < var2 && value > var3) {
        this.var1 = value;
        Type1.set(value);
    } else if (value < var3) {
        this.var1 = -1.0f;
    } else {
        this.var1 = 1.0f;
    }
}

public void handleResponse(Type1<java.util.List<Type2>> request, Type3<java.util.List<Type2>> response) {
    var2 = response.method2();
    var3 = new Type4<>(var2, getContext(), (getActivity() instanceof Type5) ? (Type5) getActivity() : null);
    var4.method3(var3);
    Type6.method4("STRING_1", String.valueOf(var2.size()));
}

public static boolean compareStrings(String str1, String str2) {
    return str1 != null ? str1.equals(str2) : str2 == null;
}