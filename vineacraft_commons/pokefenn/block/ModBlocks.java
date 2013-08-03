package pokefenn.block;

import net.minecraft.block.Block;
import net.minecraftforge.fluids.Fluid;
import pokefenn.lib.BlockIds;
import pokefenn.lib.Strings;
import pokefenn.tileentity.TileAdvancedSqueezer;
import pokefenn.tileentity.TileAutomaticSqueezer;
import pokefenn.tileentity.TileManualSqueezer;
import pokefenn.tileentity.TileVineaFurnace;
import pokefenn.tileentity.TileVineaHarvester;
import pokefenn.tileentity.TileVineaHatcher;
import pokefenn.tileentity.TileVineaInfuser;
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
    //public static Block vineSapFlowing;
    //public static Block vineSapStill;
    public static Block advancedMachineBlock;
    public static Block basicMachineBlock;
    
    public static Fluid vineSap;
    
    
    public static void init() {
        
       manualSqueezer = new BlockManualSqueezer(BlockIds.MANUAL_SQUEEZER);
       automaticSqueezer = new BlockAutomaticSqueezer(BlockIds.AUTOMATIC_SQUEEZER);
       vineaInfuser = new BlockVineaInfuser(BlockIds.VINEA_INFUSER);
       vineaFurnace = new BlockVineaInfuser(BlockIds.VINEA_FURNACE);
       vineaHarvester = new BlockVineaHarvester(BlockIds.VINEA_HARVESTER);
       advancedSqueezer = new BlockAdvancedSqueezer(BlockIds.ADVANCED_SQUEEZER);
       vineaHatcher = new BlockVineaHatcher(BlockIds.VINEA_HATCHER);
       //vineSapStill = new BlockVineSapStill(BlockIds.VINE_SAP_STILL);
       //vineSapFlowing = new BlockVineSapFlowing(BlockIds.VINE_SAP_FLOWING);
       advancedMachineBlock = new BlockAdvancedMachineBlock(BlockIds.ADVANCED_MACHINE_BLOCK);
       basicMachineBlock = new BlockBasicMachineBlock(BlockIds.BASIC_MACHINE_BLOCK);
       
        
       GameRegistry.registerBlock(manualSqueezer, Strings.MANUAL_SQUEEZER_NAME);
       GameRegistry.registerBlock(automaticSqueezer, Strings.AUTOMATIC_SQUEEZER_NAME);
       GameRegistry.registerBlock(advancedSqueezer, Strings.ADVANCED_SQUEEZER_NAME);
       GameRegistry.registerBlock(vineaFurnace, Strings.VINEA_FURNACE_NAME);
       GameRegistry.registerBlock(vineaHarvester, Strings.VINEA_HARVESTER_NAME);
       //GameRegistry.registerBlock(vineSapFlowing, Strings.VINE_SAP_FLOWING_NAME);
       //GameRegistry.registerBlock(vineSapStill, Strings.VINE_SAP_STILL_NAME);
       GameRegistry.registerBlock(advancedMachineBlock, Strings.ADVANCED_MACHINE_BLOCK_NAME);
       GameRegistry.registerBlock(basicMachineBlock, Strings.BASIC_MACHINE_BLOCK_NAME);
       
        //vineSap = new Fluid("Vine_Sap");
	    //FluidRegistry.registerFluid(vineSap/*, Strings.VINE_SAP_NAME*/);
       
    }
    
    
    public static final String TEXTURE_LOCATION = "mods";
    
    public static final String ADVANCED_MACHINE_BLOCK_TOP = "advancedMachineBlockTop";
    public static final String ADVANCED_MACHINE_BLOCK_SIDE = "advancedMachineBlockSide";
    public static final String ADVANCED_MACHINE_BLOCK_BOTTOM = "advancedMachineBlockBottom";
    
    public static final String BASIC_MACHINE_BLOCK_TOP_AND_BOT = "basicMachineBlockTopAndBot";
    public static final String BASIC_MACHINE_BLOCK_SIDE = "basicMachineBlockSide";
    
    
    
    public static void registerTileEntities(){
        
        GameRegistry.registerTileEntity(TileManualSqueezer.class, Strings.TE_MANUAL_SQUEEZER_NAME);
        GameRegistry.registerTileEntity(TileAutomaticSqueezer.class, Strings.TE_AUTOMATIC_SQUEEZER_NAME);
        GameRegistry.registerTileEntity(TileAdvancedSqueezer.class, Strings.TE_ADVANCED_SQUEEZER_NAME);
        GameRegistry.registerTileEntity(TileVineaHatcher.class, Strings.TE_VINEA_HATCHER_NAME);
        GameRegistry.registerTileEntity(TileVineaFurnace.class, Strings.TE_VINEA_FURNACE_NAME);
        GameRegistry.registerTileEntity(TileVineaInfuser.class, Strings.VINEA_INFUSER_NAME);
        GameRegistry.registerTileEntity(TileVineaHarvester.class, Strings.TE_VINEA_HARVESTER_NAME);
        
        
        
    }
}
