public <T extends TYPE_2<?>> T findMatchingType(Class<T> clazz) {
    for (final TYPE_2<?> element : VAR_3.values()) {
        if (clazz.isInstance(element)) {
            return clazz.cast(element);
        }
    }
    throw new TYPE_3(STRING_1 + clazz);
}

public void testStringComparison() {
    String str1 = STRING_1;
    String str2 = STRING_2;
    boolean result = VAR_4.compare(str1, str2);
    assertTrue(result);
    result = VAR_4.compare(str2, str1);
    assertTrue(result);
}

public void handleType1(TYPE_1 parameter) {
    TYPE_2.logMessage(VAR_2, STRING_1);
    if (parameter != null) {
        VAR_3 = parameter;
        if (getHandler() == null) {
            TYPE_2.logMessage(VAR_2, STRING_2);
        } else {
            TYPE_2.logMessage(VAR_2, STRING_3);
        }
        getHandler().register(VAR_4, null, this);
    }
}

public String getMethodInfo() {
    int argCount = method.getParameterTypes().length;
    return getDeclaringClass().getName() + STRING_1 + this.method.getName() + STRING_2 + argCount;
}