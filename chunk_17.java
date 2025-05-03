public int calculateValue(Type1 input) {
    int value1 = getValue(input.getVar3());
    int value2 = getValue(input.getVar5());
    if (value1 == value2) {
        return (int) (Math.pow(INT_CONSTANT, value1) + calculateValue(input.getVar5()));
    } else {
        return (int) Math.pow(INT_CONSTANT, value2) + calculateValue(input.getVar3());
    }
}

public synchronized void addToMap(Type1 key, Type2 value) {
    List<Type2> list = map.getOrDefault(key, new ArrayList<>());
    list.add(value);
    map.put(key, list);
    System.out.println("Entry added for key: " + key + " successfully.");
    if (specialCollection.contains(key)) {
        System.out.println("Special key processed");
        notifyListener(new CustomEvent(key), value);
    }
}

public void testMethod() {
    final Type1 result = new Type2Builder(baseValue)
            .withParam(parameter)
            .build();
    CustomAssert.assertEquals(EXPECTED_SIZE, 0, result.getItems().size());
    result.getItems().add("New Item");
}

public void initialize(Type1 input) {
    this.input = input;
    Type2 var2 = new Type2();
    // Remaining initialization code
}