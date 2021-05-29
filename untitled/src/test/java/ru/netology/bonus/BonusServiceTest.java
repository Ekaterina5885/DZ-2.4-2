package ru.netology.bonus;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BonusServiceTest {
    @ParameterizedTest(name = "{index}+{0}")
    @CsvFileSource(resources = "/data.csv")
    void shouldCalculate(String first, long amount, boolean registered, long expected) {
        BonusService service = new BonusService();

        long actual = service.calculateRegistered(amount, registered);

        assertEquals(expected, actual);
    }
}
