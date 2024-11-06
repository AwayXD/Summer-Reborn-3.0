package summer.base.commands;

import net.minecraft.util.EnumChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.util.EnumFacing;
import summer.base.manager.Command;
import summer.base.utilities.ChatUtils;

public class HClipCommand implements Command {

    @Override
    public boolean run(String[] args) {
        if (args.length == 2) {
            double posMod = Double.parseDouble(args[1]);
            if (Minecraft.getMinecraft().thePlayer.getHorizontalFacing() == EnumFacing.SOUTH) {
                Minecraft.getMinecraft().thePlayer.setPosition(Minecraft.getMinecraft().thePlayer.posX, Minecraft.getMinecraft().thePlayer.posY, Minecraft.getMinecraft().thePlayer.posZ + posMod);
            }
            if (Minecraft.getMinecraft().thePlayer.getHorizontalFacing() == EnumFacing.WEST) {
                Minecraft.getMinecraft().thePlayer.setPosition(Minecraft.getMinecraft().thePlayer.posX + -posMod, Minecraft.getMinecraft().thePlayer.posY, Minecraft.getMinecraft().thePlayer.posZ);
            }
            if (Minecraft.getMinecraft().thePlayer.getHorizontalFacing() == EnumFacing.EAST) {
                Minecraft.getMinecraft().thePlayer.setPosition(Minecraft.getMinecraft().thePlayer.posX + posMod, Minecraft.getMinecraft().thePlayer.posY, Minecraft.getMinecraft().thePlayer.posZ);
            }
            if (Minecraft.getMinecraft().thePlayer.getHorizontalFacing() == EnumFacing.NORTH) {
                Minecraft.getMinecraft().thePlayer.setPosition(Minecraft.getMinecraft().thePlayer.posX, Minecraft.getMinecraft().thePlayer.posY, Minecraft.getMinecraft().thePlayer.posZ + -posMod);
            }
            ChatUtils.sendMessage("Teleported " + posMod + " blocks horizontally.");
            return true;
        }
        return false;
    }

    @Override
    public String usage() {
        return EnumChatFormatting.WHITE + "hc | hclip <value>";
    }
}