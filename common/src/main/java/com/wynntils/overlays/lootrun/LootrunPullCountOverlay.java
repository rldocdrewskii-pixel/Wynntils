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
            if(gt(lootrun_daily_bonus_pulls; 0); concat(" §8(§b+";string(lootrun_daily_bonus_pulls);"§8)"); ""); "\n";
            if(gt(lootrun_mission_pulls; 0); concat("§9Mission Pulls: ";string(lootrun_mission_pulls);"\n"); "");
            if(neq(lootrun_trial_pulls; 0); concat("§4Trial Pulls: ";string(lootrun_trial_pulls);"\n"); "");
            if(gt(lootrun_sacrificed_pulls; 0); concat("§cSacrificed Pulls: ";string(lootrun_sacrificed_pulls);"\n"); "");
            "\n";
            "§eRerolls: ";string(int(add(lootrun_rerolls;lootrun_daily_bonus_rerolls)));"\n";
            "§cSacrifices: ";string(int(add(lootrun_sacrifices;lootrun_daily_bonus_sacrifices)));
            if(gt(lootrun_sacrifices; 0); concat(" §8(§c";string(round(lootrun_sacrifice_percentage;1));"%§8)"); ""); "\n\n";
            "§6Total Pulls: ";string(lootrun_total_pulls);
            if(gt(lootrun_total_pulls_sacrificed; 0); concat(" §8(§c";string(lootrun_total_pulls_sacrificed);"§8)"); ""); "\n";
            "§aEffective Pulls: ";string(lootrun_effective_pulls)
            )}
            """;

    private static final String PREVIEW_TEMPLATE =
            """
            §fChallenge Pulls: 5 §8(§b+2§8)
            §9Mission Pulls: 7
            §4Trial Pulls: 4
            §cSacrificed Pulls: 3
            §f
            §eRerolls: 4
            §cSacrifices: 2 §8(§c75.0%§8)
            §f
            §6Total Pulls: 19 §8(§c15§8)
            §aEffective Pulls: 76
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