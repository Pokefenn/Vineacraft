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
    public static Item vineaShears;
    public static Item vineaWrench;
    public static Item advancedVineaMachineBlock;
    public static Item basicVineaMachineBlock;
    public static Item vinium;
    
    public static void init() {
        
        
        /* Initialize each mod item indivudually*/
        
        vineParts = new ItemVineParts(ItemIds.VINE_PARTS);
        vineaShears = new ItemVineaShears(ItemIds.VINEA_SHEARS);
        vineaWrench = new ItemVineaWrench(ItemIds.VINEA_WRENCH);
        advancedVineaMachineBlock = new ItemAdvancedVineaMachineBlock(ItemIds.ADVANCED_VINEA_MACHINE_BLOCK);
        basicVineaMachineBlock = new ItemBasicVineaMachineBlock(ItemIds.BASIC_VINEA_MACHINE_BLOCK);
        vinium = new ItemVinium(ItemIds.VINIUM);
        
        
    }
}
