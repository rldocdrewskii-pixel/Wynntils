/*
 * Copyright © Wynntils 2025.
 * This file is released under LGPLv3. See LICENSE for full license details.
 */
package com.wynntils.models.lootrun.type;

import java.util.Arrays;
import java.util.List;

public enum TrialType {
    UNKNOWN("Unknown"),
    FAILED("Failed"),

    ALL_IN("All In"),
    GAMBLING_BEAST("Gambling Beast"),
    HUBRIS("Hubris", 1, 1),
    LIGHTS_OUT("Lights Out"),
    SIDE_HUSTLE("Side Hustle", 0, 2),
    TREASURY_BILL("Treasury Bill"),
    ULTIMATE_SACRIFICE("Ultimate Sacrifice", 2, 0),
    WARMTH_DEVOURER("Warmth Devourer", 1, 1);

    private final String name;
    private final int sacrifices;
    private final int rerolls;

    TrialType(String name) {
        this.name = name;
        this.sacrifices = 0;
        this.rerolls = 0;
    }

    TrialType(String name, int sacrifices, int rerolls) {
        this.name = name;
        this.sacrifices = sacrifices;
        this.rerolls = rerolls;
    }

    public String getName() {
        return name;
    }

    public int getSacrifices() {
        return sacrifices;
    }

    public int getRerolls() {
        return rerolls;
    }

    public static TrialType fromName(String name) {
        for (TrialType type : values()) {
            if (type == UNKNOWN || type == FAILED) continue;
            if (type.getName().equalsIgnoreCase(name)) {
                return type;
            }
        }

        return UNKNOWN;
    }

    public static List<TrialType> trialTypes() {
        return Arrays.stream(values())
                .filter(type -> type != UNKNOWN && type != FAILED)
                .toList();
    }
}