package org.HW4;

import org.hw4.TriangleAreaIsSideException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hw4.TriangleArea.triangleArea;

/**
 * @Author Александр Ключка
 * @created 2022-08-04  00:58
 **/
public class triangleAreaTest {
    @Test
    @DisplayName("Метод проверки площади треугольника")
    void isTriangleAreaTrue() throws TriangleAreaIsSideException {
        assertThat(triangleArea(5.0, 4.0, 3.0)).isEqualTo(6.0);
    }
}
