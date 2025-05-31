#include <iostream>
#include <vector>
#include <string>

int multiply(const int x, const int y) {
    return x * y;
}

void printArray(const std::vector<int>& arr) {
    for (const auto& num : arr) {
        std::cout << num << " ";
    }
    std::cout << "\n";
}

std::string getInput() {
    std::string input;
    std::getline(std::cin, input);
    return input;
}

std::vector<int> createArray(int n) {
    std::vector<int> arr;
    for (int i = 0; i < n; ++i) {
        arr.push_back((i + 1) * 2);
    }
    return arr;
}

int main() {
    const int a = 5, b = 3;
    std::cout << "Product: " << multiply(a, b) << "\n";

    auto arr = createArray(5);
    printArray(arr);

    std::cout << "Enter your name: ";
    std::string name = getInput();
    std::cout << "Hello " << name << "\n";

    return 0;
}