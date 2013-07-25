package pokefenn.block;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import pokefenn.lib.BlockIds;

@SuppressWarnings("unused")
public class ModBlocks {

    
    public static Block manualSqueezer;
    public static Block automaticSqueezer;
    public static Block vineaInfuser;
    public static Block vineaFurnace;
    public static Block vineaHarvester;
    public static Block vineSapFlowing;
    public static Block vineSapStill;
    public static Block liquidCocoaStill;
    public static Block liquidCocoaFlowing;
    
    
    public static void init() {
        
       manualSqueezer = new BlockManualSqueezer(BlockIds.MANUAL_SQUEEZER);
       automaticSqueezer = new BlockAutomaticSqueezer(BlockIds.AUTOMATIC_SQUEEZER);
       vineaInfuser = new BlockVineaInfuser(BlockIds.VINEA_INFUSER);
       vineaFurnace = new BlockVineaInfuser(BlockIds.VINEA_FURNACE);
       vineaHarvester = new BlockVineaHarvester(BlockIds.VINEA_HARVESTER);
       vineSapFlowing = new BlockVineSapFlowing(BlockIds.VINE_SAP_FLOWING);
       vineSapStill = new BlockVineSapStill(BlockIds.VINE_SAP_STILL);
       liquidCocoaStill = new BlockLiquidCocoaStill(BlockIds.LIQUID_COCOA_STILL);
       liquidCocoaFlowing = new BlockLiquidCocoaFlowing(BlockIds.LIQUID_COCOA_FLOWING);
       
        
        
    }
    
    
    private static void initBlockRecipies() {
        
        
    }
    
}
