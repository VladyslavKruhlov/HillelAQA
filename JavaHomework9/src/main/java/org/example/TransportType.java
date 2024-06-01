package org.example;

import java.util.Map;

public enum TransportType {
    METRO(Map.of(1, "10 грн", 2, "20 грн", 3, "30 грн")),
    TRAIN(Map.of(1, "400 грн", 2, "500 грн", 3, "600 грн")),
    BUS(Map.of(1, "100 грн", 2, "200 грн", 3, "300 грн"));

    private Map<Integer, String> enumValue;

    public Map<Integer, String> getEnumValue() {
        return enumValue;
    }
    TransportType(Map<Integer, String> enumValue) {
        this.enumValue = enumValue;
    }

    TransportType() {}
}