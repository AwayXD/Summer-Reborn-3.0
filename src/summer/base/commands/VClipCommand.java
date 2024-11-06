package summer.base.commands;

import net.minecraft.util.EnumChatFormatting;

import net.minecraft.client.Minecraft;
import net.minecraft.util.EnumFacing;
import summer.Summer;
import summer.base.manager.config.Cheats;
import summer.base.manager.Command;
import summer.base.utilities.ChatUtils;

public class VClipCommand implements Command {

    @Override
    public boolean run(String[] args) {
        if (args.length == 2) {
            double blocks = Double.parseDouble(args[1]);
            Minecraft.getMinecraft().thePlayer.setEntityBoundingBox(Minecraft.getMinecraft().thePlayer.getEntityBoundingBox().offset(0.0D, blocks, 0.0D));
            ChatUtils.sendMessage("Teleported " + blocks + " blocks.");
            return true;
        }
        return false;
    }

    @Override
    public String usage() {
        return EnumChatFormatting.WHITE + "vc | vclip <value>";
    }
}