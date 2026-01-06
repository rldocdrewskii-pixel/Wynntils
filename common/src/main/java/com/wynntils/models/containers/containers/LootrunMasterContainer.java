package com.wynntils.models.containers.containers;

import com.wynntils.models.containers.Container;

import java.util.List;
import java.util.regex.Pattern;

public class LootrunMasterContainer extends Container {
    public static final Pattern TITLE_PATTERN = Pattern.compile("\uDAFF\uDFF5\uE007\uDAFF\uDF70\uF02D");

    public static final List<Integer> START_LOOTRUN_ITEM_SLOTS = List.of(24, 25, 26);
    public static final Pattern START_LOOTRUN_ITEM_PATTERN = Pattern.compile("§[b6]§lStart a Lootrun!");

    public LootrunMasterContainer() {
        super(TITLE_PATTERN);
    }
}
