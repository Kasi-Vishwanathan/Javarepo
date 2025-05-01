public void processInput(TYPE_1 input) {
    if (input.getStatus() == 1) {
        int index = inputCollection.findIndex(input.getId());
        if (index > -1) {
            String resourceName = inputCollection.getResourceName(index);
            currentResource = resourceName;
            String className = resourceName.replaceAll(REGEX_PATTERN, REPLACEMENT);
            Class<?> targetClass = classRegistry.get(className);
            loadClass(targetClass);
        }
    }
}

protected static int countSpecialFiles(String basePath) {
    File outputDir = new File(String.format("%s%s%s", basePath, FILE_SUFFIX, EXTENSION));
    File[] files = outputDir.listFiles();
    assert files != null : "Directory does not exist or is not accessible";
    assert files.length > 1 : "Insufficient files in directory";

    int specialFileCount = 0;
    for (File file : files) {
        if (file.getName().startsWith(SPECIAL_PREFIX)) {
            specialFileCount++;
        }
    }
    return specialFileCount;
}

public int calculateNextVersion() {
    SharedPreferences preferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
    int currentVersion = preferences.getInt(VERSION_KEY, 0);
    return currentVersion != 0 ? currentVersion + 1 : 0;
}