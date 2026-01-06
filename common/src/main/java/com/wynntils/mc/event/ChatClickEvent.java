package com.wynntils.mc.event;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.ICancellableEvent;

public class ChatClickEvent extends Event implements ICancellableEvent {
    private final Component component;
    private final Style style;
    private final String clickedText;
    private final int mouseX;
    private final int mouseY;

    public ChatClickEvent(Component component, Style style, String clickedText, int mouseX, int mouseY) {
        this.component = component;
        this.style = style;
        this.clickedText = clickedText;
        this.mouseX = mouseX;
        this.mouseY = mouseY;
    }

    public Component getComponent() {
        return component;
    }

    public Style getStyle() {
        return style;
    }

    public String getClickedText() {
        return clickedText;
    }

    public int getMouseX() {
        return mouseX;
    }

    public int getMouseY() {
        return mouseY;
    }
}