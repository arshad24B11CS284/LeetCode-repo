bool isHappy(int n) {
    int sum = 0, r;

    while (1) {
        r = n % 10;
        sum = sum + r * r;
        n = n / 10;
        if (n == 0) {
            n = sum;
            sum = 0;
            if (n >= 0 && n <= 9) {
                break;
            }
        }
    }

    if (n == 1 || n == 7) {
        return true;
    } else {
        return false;
    }

}