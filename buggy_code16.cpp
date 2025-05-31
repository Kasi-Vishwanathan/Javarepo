#include <iostream>
#include <vector>
#include <string>
#include <cstdlib>

int multiply(int x, int y) {
    return x * y;
}

void printArray(const std::vector<int>& arr) {
    bool first = true;
    for (const auto& num : arr) {
        if (!first) {
            std::cout << " ";
        }
        std::cout << num;
        first = false;
    }
    std::cout << "\n";
}

std::string getInput() {
    std::string input;
    std::getline(std::cin, input);
    return input;
}

std::vector<int> createArray(std::size_t n) {
    std::vector<int> arr;
    arr.reserve(n);
    for (std::size_t i = 0; i < n; ++i) {
        arr.push_back((i + 1) * 2);
    }
    return arr;
}

int main() {
    const int a = 5, b = 3;
    std::cout << "Product: " << multiply(a, b) << "\n";

    auto arr = createArray(5);
    printArray(arr);

    std::cout << "Enter your name: " << std::flush;
    std::string name = getInput();
    std::cout << "Hello " << name << "\n";

    return 0;
}