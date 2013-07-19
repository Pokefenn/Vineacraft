package pokefenn.item;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import pokefenn.lib.ItemIds;

import cpw.mods.fml.common.registry.GameRegistry;


@SuppressWarnings("unused")
public class ModItems {

    
    /* Mod item instances */
    
    public static Item vineParts;
    
    
    public static void init() {
        
        
        /* Initialize each mod item indivudually*/
        
        vineParts = new ItemVineParts(ItemIds.VINE_PARTS);
    }
}
