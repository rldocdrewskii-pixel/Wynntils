/*
 * Copyright © Wynntils 2025.
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

    private int challengePulls = 0;
    private int dailyBonusPulls = 0;
    private int dailyBonusRerolls = 0;
    private int dailyBonusSacrifices = 0;
    private int sacrificedPulls = 0;
    private int missionPulls = 0;
    private int missionRerolls = 0;
    private int missionSacrifices = 0;
    private int trialPulls = 0;
    private int trialRerolls = 0;
    private int trialSacrifices = 0;
    private int lastBeaconRewardPulls = 0;

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

    public int getChallengePulls() { return challengePulls; }

    public void setChallengePulls(int challengePulls) { this.challengePulls = challengePulls; }

    public int getDailyBonusPulls() { return dailyBonusPulls; }

    public void setDailyBonusPulls(int dailyBonusPulls) { this.dailyBonusPulls = dailyBonusPulls; }

    public int getDailyBonusRerolls() { return dailyBonusRerolls; }

    public void setDailyBonusRerolls(int dailyBonusRerolls) { this.dailyBonusRerolls = dailyBonusRerolls;}

    public int getDailyBonusSacrifices() { return dailyBonusSacrifices; }

    public void setDailyBonusSacrifices(int dailyBonusSacrifices) { this.dailyBonusSacrifices = dailyBonusSacrifices; }

    public int getSacrificedPulls() { return sacrificedPulls; }

    public void setSacrificedPulls(int sacrificedPulls) { this.sacrificedPulls = sacrificedPulls; }

    public int getMissionPulls() { return missionPulls; }

    public void setMissionPulls(int missionPulls) { this.missionPulls = missionPulls; }

    public int getMissionRerolls() { return missionRerolls; }

    public void setMissionRerolls(int missionRerolls) { this.missionRerolls = missionRerolls; }

    public int getMissionSacrifices() { return missionSacrifices; }

    public void setMissionSacrifices(int missionSacrifices) { this.missionSacrifices = missionSacrifices; }

    public int getTrialPulls() { return trialPulls; }

    public void setTrialPulls(int trialPulls) { this.trialPulls = trialPulls; }

    public int getTrialRerolls() { return trialRerolls; }

    public void setTrialRerolls(int trialRerolls) { this.trialRerolls = trialRerolls; }

    public int getTrialSacrifices() { return trialSacrifices; }

    public void setTrialSacrifices(int trialSacrifices) { this.trialSacrifices = trialSacrifices; }

    public int getLastBeaconRewardPulls() {
        return lastBeaconRewardPulls;
    }

    public void setLastBeaconRewardPulls(int lastBeaconRewardPulls) {
        this.lastBeaconRewardPulls = lastBeaconRewardPulls;
    }
}