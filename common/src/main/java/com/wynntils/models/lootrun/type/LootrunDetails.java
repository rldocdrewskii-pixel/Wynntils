/*
 * Copyright © Wynntils 2025-2026.
 * This file is released under LGPLv3. See LICENSE for full license details.
 */
package com.wynntils.models.lootrun.type;

import com.wynntils.models.beacons.type.Beacon;
import com.wynntils.models.lootrun.beacons.LootrunBeaconKind;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class LootrunDetails {
    private Map<LootrunBeaconKind, Integer> selectedBeacons = new TreeMap<>();
    private LootrunBeaconKind lastTaskBeaconColor = null;
    private boolean lastTaskVibrantBeacon = false;
    private Beacon<LootrunBeaconKind> closestBeacon = null;
    private int redBeaconTaskCount = 0;
    private List<Integer> orangeBeaconCounts = new ArrayList<>();
    private int orangeAmount = -1;
    private int rainbowBeaconCount = 0;
    private int rainbowAmount = -1;
    private List<MissionType> missions = new ArrayList<>();
    private List<TrialType> trials = new ArrayList<>();
    private int sacrifices = 0;
    private int rerolls = 0;
    private int challengePulls = 0;
    private int dailyBonusPulls = 0;
    private int dailyBonusRerolls = 0;
    private int dailyBonusSacrifices = 0;
    private int sacrificedPulls = 0;
    private int missionPulls = 0;
    private int trialPulls = 0;
    private int trialRerolls = 0;
    private int trialSacrifices = 0;
    private boolean treasuryBillActive = false;
    private int treasuryBillPullsGained = 0;
    private long treasuryBillLastDeductionTime = -1;
    private long treasuryBillStartTime = -1;
    private int treasuryBillStartingPulls = 0;

    public Map<LootrunBeaconKind, Integer> getSelectedBeacons() {
        return Collections.unmodifiableMap(selectedBeacons);
    }

    public void setSelectedBeacons(Map<LootrunBeaconKind, Integer> selectedBeacons) {
        this.selectedBeacons = new TreeMap<>(selectedBeacons);
    }

    public void incrementBeaconCount(LootrunBeaconKind color) {
        selectedBeacons.put(color, selectedBeacons.getOrDefault(closestBeacon.beaconKind(), 0) + 1);
    }

    public LootrunBeaconKind getLastTaskBeaconColor() {
        return lastTaskBeaconColor;
    }

    public void setLastTaskBeaconColor(LootrunBeaconKind lastTaskBeaconColor) {
        this.lastTaskBeaconColor = lastTaskBeaconColor;
    }

    public boolean getLastTaskVibrantBeacon() {
        return lastTaskVibrantBeacon;
    }

    public void setLastTaskVibrantBeacon(boolean lastTaskVibrantBeacon) {
        this.lastTaskVibrantBeacon = lastTaskVibrantBeacon;
    }

    public Beacon<LootrunBeaconKind> getClosestBeacon() {
        return closestBeacon;
    }

    public void setClosestBeacon(Beacon<LootrunBeaconKind> closestBeacon) {
        this.closestBeacon = closestBeacon;
    }

    public int getRedBeaconTaskCount() {
        return redBeaconTaskCount;
    }

    public void setRedBeaconTaskCount(int redBeaconTaskCount) {
        this.redBeaconTaskCount = redBeaconTaskCount;
    }

    public List<Integer> getOrangeBeaconCounts() {
        return Collections.unmodifiableList(orangeBeaconCounts);
    }

    public void setOrangeBeaconCounts(List<Integer> orangeBeaconCounts) {
        this.orangeBeaconCounts = new ArrayList<>(orangeBeaconCounts);
    }

    public int getOrangeAmount() {
        return orangeAmount;
    }

    public void setOrangeAmount(int orangeAmount) {
        this.orangeAmount = orangeAmount;
    }

    public int getRainbowBeaconCount() {
        return rainbowBeaconCount;
    }

    public void setRainbowBeaconCount(int rainbowBeaconCount) {
        this.rainbowBeaconCount = rainbowBeaconCount;
    }

    public int getRainbowAmount() {
        return rainbowAmount;
    }

    public void setRainbowAmount(int rainbowAmount) {
        this.rainbowAmount = rainbowAmount;
    }

    public List<MissionType> getMissions() {
        return Collections.unmodifiableList(missions);
    }

    public void setMissions(List<MissionType> missions) {
        this.missions = new ArrayList<>(missions);
    }

    public void addMission(MissionType newMission) {
        missions.add(newMission);
    }

    public List<TrialType> getTrials() {
        return Collections.unmodifiableList(trials);
    }

    public void setTrials(List<TrialType> trials) {
        this.trials = new ArrayList<>(trials);
    }

    public void addTrial(TrialType newTrial) {
        trials.add(newTrial);
    }

    public int getSacrifices() {
        return sacrifices;
    }

    public void setSacrifices(int sacrifices) {
        this.sacrifices = sacrifices;
    }

    public int getRerolls() {
        return rerolls;
    }

    public void setRerolls(int rerolls) {
        this.rerolls = rerolls;
    }

    public int getChallengePulls() {
        return challengePulls;
    }

    public void setChallengePulls(int challengePulls) {
        this.challengePulls = challengePulls;
    }

    public int getDailyBonusPulls() {
        return dailyBonusPulls;
    }

    public void setDailyBonusPulls(int dailyBonusPulls) {
        this.dailyBonusPulls = dailyBonusPulls;
    }

    public int getDailyBonusRerolls() {
        return dailyBonusRerolls;
    }

    public void setDailyBonusRerolls(int dailyBonusRerolls) {
        this.dailyBonusRerolls = dailyBonusRerolls;
    }

    public int getDailyBonusSacrifices() {
        return dailyBonusSacrifices;
    }

    public void setDailyBonusSacrifices(int dailyBonusSacrifices) {
        this.dailyBonusSacrifices = dailyBonusSacrifices;
    }

    public int getSacrificedPulls() {
        return sacrificedPulls;
    }

    public void setSacrificedPulls(int sacrificedPulls) {
        this.sacrificedPulls = sacrificedPulls;
    }

    public int getMissionPulls() {
        return missionPulls;
    }

    public void setMissionPulls(int missionPulls) {
        this.missionPulls = missionPulls;
    }

    public int getTrialPulls() {
        return trialPulls;
    }

    public void setTrialPulls(int trialPulls) {
        this.trialPulls = trialPulls;
    }

    public int getTrialRerolls() {
        return trialRerolls;
    }

    public void setTrialRerolls(int trialRerolls) {
        this.trialRerolls = trialRerolls;
    }

    public int getTrialSacrifices() {
        return trialSacrifices;
    }

    public void setTrialSacrifices(int trialSacrifices) {
        this.trialSacrifices = trialSacrifices;
    }

    public boolean isTreasuryBillActive() {
        return treasuryBillActive;
    }

    public void setTreasuryBillActive(boolean treasuryBillActive) {
        this.treasuryBillActive = treasuryBillActive;
    }

    public int getTreasuryBillPullsGained() {
        return treasuryBillPullsGained;
    }

    public void setTreasuryBillPullsGained(int treasuryBillPullsGained) {
        this.treasuryBillPullsGained = treasuryBillPullsGained;
    }

    public long getTreasuryBillLastDeductionTime() {
        return treasuryBillLastDeductionTime;
    }

    public void setTreasuryBillLastDeductionTime(long treasuryBillLastDeductionTime) {
        this.treasuryBillLastDeductionTime = treasuryBillLastDeductionTime;
    }

    public long getTreasuryBillStartTime() {
        return treasuryBillStartTime;
    }

    public void setTreasuryBillStartTime(long treasuryBillStartTime) {
        this.treasuryBillStartTime = treasuryBillStartTime;
    }

    public int getTreasuryBillStartingPulls() {
        return treasuryBillStartingPulls;
    }

    public void setTreasuryBillStartingPulls(int treasuryBillStartingPulls) {
        this.treasuryBillStartingPulls = treasuryBillStartingPulls;
    }
}
