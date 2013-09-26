package pokefenn.block;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import pokefenn.fluid.BlockVineSap;
import pokefenn.lib.BlockIds;
import pokefenn.lib.Strings;
import pokefenn.tileentity.TileAutomaticSqueezer;
import pokefenn.tileentity.TileManualSqueezer;
import pokefenn.tileentity.TileVineaFurnace;
import pokefenn.tileentity.TileVineaHarvester;
import pokefenn.tileentity.TileVineaHatcher;
import pokefenn.tileentity.TileVineaHopper;
import pokefenn.tileentity.TileVineaInfuser;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {

    //Stuff
	
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
    public static Block advancedMachineBlock;
    public static Block basicMachineBlock;
    public static Block vineaBrick;
    public static Block vineaHopper;
    public static Block vineaFluidHopper;
    //public static VineSapFluid vineSap;
    public static Block blockVineSap;
    public static Block blockVinium;
    public static Block brightVine;
    
  
    
    public static void init() {
       //Init blocks
    	
    	
    	
       manualSqueezer = new BlockManualSqueezer(BlockIds.MANUAL_SQUEEZER);
       automaticSqueezer = new BlockAutomaticSqueezer(BlockIds.AUTOMATIC_SQUEEZER);
       vineaInfuser = new BlockVineaInfuser(BlockIds.VINEA_INFUSER);
       vineaFurnace = new BlockVineaFurnace(BlockIds.VINEA_FURNACE);
       vineaHarvester = new BlockVineaHarvester(BlockIds.VINEA_HARVESTER);
       advancedSqueezer = new BlockAdvancedSqueezer(BlockIds.ADVANCED_SQUEEZER);
       vineaHatcher = new BlockVineaHatcher(BlockIds.VINEA_HATCHER);
       advancedMachineBlock = new BlockAdvancedMachineBlock(BlockIds.ADVANCED_MACHINE_BLOCK);
       basicMachineBlock = new BlockBasicMachineBlock(BlockIds.BASIC_MACHINE_BLOCK);
       vineaBrick = new BlockVineaBrick(BlockIds.VINEA_BRICK);
       vineaHopper = new BlockVineaHopper(BlockIds.VINEA_HOPPER);
       vineaFluidHopper = new BlockVineaFluidHopper(BlockIds.VINEA_FLUID_HOPPER);
       blockVineSap = new BlockVineSap(BlockIds.BLOCK_VINE_SAP);
       blockVinium = new BlockVinium(BlockIds.BLOCK_VINIUM);
       brightVine = new BlockBrightVine(BlockIds.BRIGHT_VINE);
       
       
       //vineSap = new Fluid("Vine_Sap");
        
       GameRegistry.registerBlock(vineaInfuser, Strings.VINEA_INFUSER_NAME);
       GameRegistry.registerBlock(manualSqueezer, Strings.MANUAL_SQUEEZER_NAME);
       GameRegistry.registerBlock(automaticSqueezer, Strings.AUTOMATIC_SQUEEZER_NAME);
       GameRegistry.registerBlock(advancedSqueezer, Strings.ADVANCED_SQUEEZER_NAME);
       GameRegistry.registerBlock(vineaFurnace, Strings.VINEA_FURNACE_NAME);
       GameRegistry.registerBlock(vineaHarvester, Strings.VINEA_HARVESTER_NAME);
       GameRegistry.registerBlock(advancedMachineBlock, Strings.ADVANCED_MACHINE_BLOCK_NAME);
       GameRegistry.registerBlock(basicMachineBlock, Strings.BASIC_MACHINE_BLOCK_NAME);
       GameRegistry.registerBlock(vineaHatcher, Strings.VINEA_HATCHER_NAME);
       GameRegistry.registerBlock(vineaBrick, Strings.VINEA_BRICK_NAME);
       GameRegistry.registerBlock(vineaHopper, Strings.VINEA_HOPPER_NAME);
       GameRegistry.registerBlock(vineaFluidHopper, Strings.VINEA_FLUID_HOPPER_NAME);
       GameRegistry.registerBlock(blockVineSap, Strings.BLOCK_VINE_SAP_NAME);
       GameRegistry.registerBlock(blockVinium, Strings.BLOCK_VINIUM_NAME);
       GameRegistry.registerBlock(brightVine, Strings.BRIGHT_VINE_NAME);
       
	   
       //FluidStuff
       
       //fluidVineSap = new Fluid ("Vine Sap");
       //FluidRegistry.registerFluid(vineSap);
       
    
    }
    
    
}
