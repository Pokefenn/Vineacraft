package pokefenn.recipe;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import pokefenn.block.ModBlocks;
import pokefenn.item.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;

public class VineacraftRecipes {

	
	public static void init() {
		
		  //BlocksShaped   
	       GameRegistry.addRecipe(new ItemStack(ModBlocks.manualSqueezer), new Object[] { " p ", "rcr", "wbw", ('p'), Block.pistonBase, Character.valueOf('c'), Item.cauldron, Character.valueOf('w'), Block.cloth, Character.valueOf('r'), Item.redstone, Character.valueOf('b'), ModBlocks.basicMachineBlock });
	       GameRegistry.addRecipe(new ItemStack(ModBlocks.advancedMachineBlock), new Object[] { "sds", "rmr", "sis", ('m'), Block.cobblestoneMossy, ('i'), Block.blockIron, ('r'), Block.blockRedstone, ('s'), ModItems.vineaStick, ('d'), Item.diamond });
	       GameRegistry.addRecipe(new ItemStack(ModBlocks.vineaFurnace), new Object[] { " f ", "ctc", "rbr", ('f'), Block.furnaceIdle, ('t'), ModItems.vineaTankModule, ('b'), ModBlocks.advancedMachineBlock, ('c'), Item.coal, ('r'), Item.redstone});
	       GameRegistry.addRecipe(new ItemStack(ModBlocks.automaticSqueezer), new Object[] { " p ", "iti", "rbr", ('p'), Block.pistonBase, ('t'), ModItems.vineaTankModule, ('b'), ModBlocks.advancedMachineBlock, ('i'), Item.ingotIron, ('r'), Item.redstone});
	       GameRegistry.addRecipe(new ItemStack(ModBlocks.vineaHatcher), new Object[] { " e ", "oto", "rbr", ('b'), ModBlocks.basicMachineBlock, ('e'), Item.egg, ('r'), Item.redstone, ('t'), ModItems.vineaTankModule, ('o'), Block.torchWood});
	       GameRegistry.addRecipe(new ItemStack(ModBlocks.vineaHarvester), new Object[] { " s ", "ete", "rbr", ('b'), ModBlocks.advancedMachineBlock, ('s'), ModItems.vineaShears, ('r'), Item.redstone, ('t'), ModItems.vineaTankModule, ('e'), Item.shears});
	       GameRegistry.addRecipe(new ItemStack(ModBlocks.vineaFluidHopper), new Object[] { "v v", "vtv", " v ", ('v'), ModItems.vinium, ('t'), ModItems.vineaTankModule });
	       GameRegistry.addRecipe(new ItemStack(ModBlocks.vineaHopper), new Object[]{ "viv", "vcv", " v ", ('v'), ModItems.vinium, ('i'), Block.vine, ('c'), Block.chest });
	       
		  //ItemsShaped
	       
	        GameRegistry.addRecipe(new ItemStack(ModItems.infestationVine), new Object[] { "vvv", "vsv", "vvv", ('v'), Block.vine, ('s'), Item.sugar });
	        GameRegistry.addRecipe(new ItemStack(ModItems.infestationVine), new Object[] { "vvv", "vbv", "vvv", ('v'), Block.vine, ('b'), Item.bone });
	        GameRegistry.addRecipe(new ItemStack(ModItems.vineaGrating), new Object[] { "vvv", "v v", "vvv", ('v'), Block.vine});
	        GameRegistry.addRecipe(new ItemStack(ModItems.vineaTankModule), new Object[] { "ggg", "gvg", "ggg", ('v'), Block.vine, ('g'), Block.glass  });
	        GameRegistry.addRecipe(new ItemStack(ModItems.vineaWrench), new Object[] { "v v", " v ", "v v", ('v'), ModItems.vinium });
	        GameRegistry.addRecipe(new ItemStack(ModItems.vineaShears), new Object[] { "v ", " v", ('v'), ModItems.vinium });
	        GameRegistry.addRecipe(new ItemStack(ModItems.vineaBallInfuser), new Object[] { "ivi", "i i", "ivi", ('i'), Block.fenceIron, ('v'), Block.vine});
	        GameRegistry.addRecipe(new ItemStack(ModItems.vineaStick), new Object[] { "vvv", "vsv", "vvv", ('s'), Item.stick, ('v'), Block.vine});
	        
	        
	      //BlockShapeless
	     
	        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.vineapedia), new Object[] { Item.book, Block.vine});
	        
	        
	      //ItemShapeless
	        
	         
	      //Vanilla Item
	        
	        
	      //Vanilla Block
	        
	        
	        GameRegistry.addShapelessRecipe(new ItemStack(Block.sapling, 1, 3), new Object[] { Block.sapling, Block.vine } );
	}
	
	
}
