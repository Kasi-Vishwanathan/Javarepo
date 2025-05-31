#include <iostream>
#include <vector>
#include <string>

constexpr int multiply(const int x, const int y) noexcept {
    return x * y;
}

void printArray(const std::vector<int>& arr) {
    if (arr.empty()) {
        std::cout << "\n";
        return;
    }
    auto it = arr.begin();
    std::cout << *it;
    for (++it; it != arr.end(); ++it) {
        std::cout << " " << *it;
    }
    std::cout << "\n";
}

std::string getInput() {
    std::string input;
    std::getline(std::cin, input);
    return input;
}

std::vector<int> createEvenArray(const int n) {
    if (n < 0) {
        return {};
    }
    std::vector<int> arr;
    arr.reserve(n);
    for (int i = 0; i < n; ++i) {
        arr.push_back((i + 1) * 2);
    }
    return arr;
}

int main() {
    constexpr int a = 5, b = 3;
    std::cout << "Product: " << multiply(a, b) << "\n";

    const auto arr = createEvenArray(5);
    printArray(arr);

    std::cout << "Enter your name: ";
    const std::string name = getInput();
    std::cout << "Hello " << name << "\n";

    return 0;
}