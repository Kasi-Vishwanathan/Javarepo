#include <iostream>
#include <vector>
#include <string>

// Use 'constexpr' for compile-time evaluation where possible
constexpr int multiply(int x, int y) noexcept {
    return x * y;
}

void printArray(const std::vector<int>& arr) {
    for (const auto& num : arr) {
        std::cout << num << ' ';
    }
    std::cout << '\n';
}

std::string getInput() {
    std::string input;
    std::getline(std::cin, input);
    return input;
}

// Use size_t for size parameters to avoid negative values and improve clarity
std::vector<int> createArray(size_t n) {
    std::vector<int> arr;
    arr.reserve(n);  // Pre-allocate memory to avoid reallocations
    for (size_t i = 0; i < n; ++i) {
        arr.emplace_back(static_cast<int>(i + 1) * 2);  // Use emplace_back for consistency
    }
    return arr;
}

int main() {
    constexpr int a = 5, b = 3;
    std::cout << "Product: " << multiply(a, b) << "\n";

    auto arr = createArray(5);
    printArray(arr);

    std::cout << "Enter your name: ";
    const std::string name = getInput();
    std::cout << "Hello " << name << "\n";

    return 0;
}