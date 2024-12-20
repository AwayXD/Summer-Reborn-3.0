package summer.base.commands;

import net.minecraft.util.EnumChatFormatting;

import summer.Summer;
import summer.base.manager.Command;
import summer.base.utilities.ChatUtils;

public class HelpCommand implements Command {

	@Override
	public boolean run(String[] args) {
		ChatUtils.sendMessage("\u00A77\u00A7lList of commands:");
		for (Command command : Summer.INSTANCE.commands.getCommands().values())
			ChatUtils.sendMessage(command.usage());
		return true;
	}

	@Override
	public String usage() {
		return EnumChatFormatting.WHITE + "h | help <lists commands>";
	}

}
