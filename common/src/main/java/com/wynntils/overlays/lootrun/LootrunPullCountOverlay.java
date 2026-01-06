package com.wynntils.overlays.lootrun;

import com.wynntils.core.components.Models;
import com.wynntils.core.consumers.overlays.OverlayPosition;
import com.wynntils.core.consumers.overlays.TextOverlay;
import com.wynntils.models.lootrun.type.LootrunningState;
import com.wynntils.utils.render.type.HorizontalAlignment;
import com.wynntils.utils.render.type.VerticalAlignment;

public class LootrunPullCountOverlay extends TextOverlay {
    private static final String TEMPLATE =
            """
            {concat(
            "§fChallenge Pulls: ";string(lootrun_challenge_pulls);
            if(gt(lootrun_daily_bonus_pulls; 0); concat(" §8(§b";string(lootrun_daily_bonus_pulls);"§8)"); ""); "\n";
            "§dSacrificed Pulls: ";string(lootrun_sacrificed_pulls);"\n\n";
            "§eRerolls: ";string(int(add(lootrun_base_rerolls;lootrun_daily_bonus_rerolls)));"\n";
            "§cSacrifices: ";string(int(add(lootrun_base_sacrifices;lootrun_daily_bonus_sacrifices)));
            if(gt(lootrun_sacrifice_count; 0); concat(" §8(§c";string(round(lootrun_sacrifice_percentage;1));"%§8)"); ""); "\n\n";
            "§6Total Pulls: ";string(lootrun_total_pulls);
            if(gt(lootrun_total_sacrificed_pulls; 0); concat(" §8(§c";string(lootrun_total_sacrificed_pulls);"§8)"); ""); "\n";
            "§aEffective Pulls: ";string(lootrun_effective_pulls)
            )}
            """;

    private static final String PREVIEW_TEMPLATE =
            """
            §fChallenge Pulls: 5 §8(&b2§8)
            §dSacrificed Pulls: 3
            §f
            §eRerolls: 4
            §cSacrifices: 2 §8(§c75.0%§8)
            §f
            §6Total Pulls: 8 §8(§c6§8)
            §aEffective Pulls: 40
            """;

    public LootrunPullCountOverlay() {
        super(
                new OverlayPosition(
                        120,
                        70,
                        VerticalAlignment.TOP,
                        HorizontalAlignment.LEFT,
                        OverlayPosition.AnchorSection.MIDDLE_LEFT),
                150,
                70);
    }

    @Override
    protected String getTemplate() {
        return TEMPLATE;
    }

    @Override
    protected String getPreviewTemplate() {
        return PREVIEW_TEMPLATE;
    }

    @Override
    public boolean isVisible() {
        return Models.Lootrun.getState() != LootrunningState.NOT_RUNNING;
    }
}
