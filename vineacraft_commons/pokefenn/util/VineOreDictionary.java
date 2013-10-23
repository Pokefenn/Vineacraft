package pokefenn.util;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import pokefenn.block.ModBlocks;
import pokefenn.lib.Strings;

public class VineOreDictionary {
	
	public static Block cropVine;
	
	public static void oreRegistration(){
	
	
	
	OreDictionary.registerOre("cropVine", new ItemStack(Block.vine));
	//OreDictionary.registerOre("vine", new ItemStack (Block.vine));
	OreDictionary.registerOre("cropVine", new ItemStack(ModBlocks.brightVine));

}
}