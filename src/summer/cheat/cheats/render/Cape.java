package summer.cheat.cheats.render;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.util.ResourceLocation;
import summer.Summer;
import summer.base.manager.Selection;
import summer.cheat.eventsystem.EventTarget;
import summer.cheat.guiutil.Setting;
import summer.base.manager.config.Cheats;

public class Cape extends Cheats {

    public Cape() {
        super("Cape", "silly cape fix lmao", Selection.RENDER);
    }

    public ResourceLocation getCape() {
        return new ResourceLocation("client/images/cape.png");
    }

    public boolean canRender(AbstractClientPlayer player) {
        if (player == Minecraft.thePlayer) return true;
        return false;
    }

}


