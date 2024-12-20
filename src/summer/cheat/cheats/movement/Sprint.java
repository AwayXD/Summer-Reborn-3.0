package summer.cheat.cheats.movement;

import net.minecraft.client.Minecraft;
import net.minecraft.util.MovementInput;
import summer.Summer;
import summer.base.manager.Selection;
import summer.cheat.guiutil.Setting;
import summer.cheat.eventsystem.EventTarget;
import summer.cheat.eventsystem.events.player.EventUpdate;
import summer.base.manager.config.Cheats;

public class Sprint extends Cheats {
    private Setting omni;
    public Minecraft mc = Minecraft.getMinecraft();

    public Sprint() {
        super("Sprint", "Sprint all the time", Selection.MOVEMENT, false);
        Summer.INSTANCE.settingsManager.Property(omni = new Setting("Omni", this, false));
    }

    @Override
    public void onSetup() {
    }

    @Override
    public void onDisable() {
        Minecraft.getMinecraft().thePlayer.setSprinting(false);
    }

    @EventTarget
    public void onUpdate(EventUpdate e) {
        this.setDisplayName("Sprint");
        if (e.isPre() && Minecraft.getMinecraft().thePlayer.moveForward > 0.0 && !Minecraft.getMinecraft().thePlayer.isSneaking() && !Minecraft.getMinecraft().thePlayer.isCollidedHorizontally && !Minecraft.getMinecraft().thePlayer.isUsingItem() && Minecraft.getMinecraft().thePlayer.getFoodStats().getFoodLevel() > 6) {
            Minecraft.getMinecraft().thePlayer.setSprinting(true);
        }
        if (omni.getValBoolean()) {
            this.setDisplayName("Sprint\u00A77 " + "Omni");
            if (e.isPre() && !Minecraft.getMinecraft().thePlayer.isSneaking() && MovementInput.moveForward != 0.0f || MovementInput.moveStrafe != 0.0f && !Minecraft.getMinecraft().thePlayer.isSneaking() && !Minecraft.getMinecraft().thePlayer.isCollidedHorizontally && !Minecraft.getMinecraft().thePlayer.isUsingItem() && Minecraft.getMinecraft().thePlayer.getFoodStats().getFoodLevel() > 6) {
                Minecraft.getMinecraft().thePlayer.setSprinting(true);
            }
        }
    }
}