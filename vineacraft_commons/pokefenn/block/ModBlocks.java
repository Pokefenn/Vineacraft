package pokefenn.block;

import net.minecraft.block.Block;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import pokefenn.lib.BlockIds;
import pokefenn.lib.Strings;
import pokefenn.tileentity.TileAdvancedSqueezer;
import pokefenn.tileentity.TileAutomaticSqueezer;
import pokefenn.tileentity.TileManualSqueezer;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {

    
    public static Block manualSqueezer;
    public static Block automaticSqueezer;
    public static Block vineaInfuser;
    public static Block vineaFurnace;
    public static Block vineaHarvester;
    //public static Block liquidCocoaStill;
    //public static Block liquidCocoaFlowing;
    public static Block advancedSqueezer;
    public static Block vineaHatcher;
    public static Block vineSapFlowing;
    public static Block vineSapStill;
    
    
    public static void init() {
        
       manualSqueezer = new BlockManualSqueezer(BlockIds.MANUAL_SQUEEZER);
       automaticSqueezer = new BlockAutomaticSqueezer(BlockIds.AUTOMATIC_SQUEEZER);
       vineaInfuser = new BlockVineaInfuser(BlockIds.VINEA_INFUSER);
       vineaFurnace = new BlockVineaInfuser(BlockIds.VINEA_FURNACE);
       vineaHarvester = new BlockVineaHarvester(BlockIds.VINEA_HARVESTER);
       advancedSqueezer = new BlockAdvancedSqueezer(BlockIds.ADVANCED_SQUEEZER);
       vineaHatcher = new BlockVineaHatcher(BlockIds.VINEA_HATCHER);
      // vineSapStill = new BlockVineSapStill(BlockIds.VINE_SAP_STILL);
      // vineSapFlowing = new BlockVineSapFlowing(BlockIds.VINE_SAP_FLOWING);
       
        
       GameRegistry.registerBlock(manualSqueezer, Strings.MANUAL_SQUEEZER_NAME);
       GameRegistry.registerBlock(automaticSqueezer, Strings.AUTOMATIC_SQUEEZER_NAME);
       GameRegistry.registerBlock(advancedSqueezer, Strings.ADVANCED_SQUEEZER_NAME);
       GameRegistry.registerBlock(vineaFurnace, Strings.VINEA_FURNACE_NAME);
       GameRegistry.registerBlock(vineaHarvester, Strings.VINEA_HARVESTER_NAME);
     //  GameRegistry.registerBlock(vineSapFlowing, Strings.VINE_SAP_FLOWING_NAME);
     //  GameRegistry.registerBlock(vineSapStill, Strings.VINE_SAP_STILL_NAME);
       //GameRegistry
       
       
        //vineSap = new Fluid("Vine_Sap");
		//FluidRegistry.registerFluid(vineSap);
       
    }
    
    
    private static void initBlockRecipies() {
        
        
    }
    
    
    public static void registerTileEntities(){
        
        GameRegistry.registerTileEntity(TileManualSqueezer.class, Strings.TE_MANUAL_SQUEEZER_NAME);
        GameRegistry.registerTileEntity(TileAutomaticSqueezer.class, Strings.TE_AUTOMATIC_SQUEEZER_NAME);
        GameRegistry.registerTileEntity(TileAdvancedSqueezer.class, Strings.TE_ADVANCED_SQUEEZER_NAME);
        
    }
}
