package pokefenn.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.Fluid;
import pokefenn.fluid.FluidVineSap;
import pokefenn.item.ModItems;
import pokefenn.lib.BlockIds;
import pokefenn.lib.Strings;
import pokefenn.tileentity.TileAdvancedSqueezer;
import pokefenn.tileentity.TileAutomaticSqueezer;
import pokefenn.tileentity.TileManualSqueezer;
import pokefenn.tileentity.TileVineaFurnace;
import pokefenn.tileentity.TileVineaHarvester;
import pokefenn.tileentity.TileVineaHatcher;
import pokefenn.tileentity.TileVineaHopper;
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
    public static Block vineSapFlowing;
    public static Block vineSapStill;
    public static Block advancedMachineBlock;
    public static Block basicMachineBlock;
    public static Block vineaBrick;
    public static Block vineaHopper;
    public static Block vineaFluidHopper;
    //public static VineSapFluid vineSap;
    public static Block blockVineSap;
    
    public static Fluid vineSap;
  
    
    public static void init() {
       
       manualSqueezer = new BlockManualSqueezer(BlockIds.MANUAL_SQUEEZER);
       automaticSqueezer = new BlockAutomaticSqueezer(BlockIds.AUTOMATIC_SQUEEZER);
       vineaInfuser = new BlockVineaInfuser(BlockIds.VINEA_INFUSER);
       vineaFurnace = new BlockVineaFurnace(BlockIds.VINEA_FURNACE);
       vineaHarvester = new BlockVineaHarvester(BlockIds.VINEA_HARVESTER);
       advancedSqueezer = new BlockAdvancedSqueezer(BlockIds.ADVANCED_SQUEEZER);
       vineaHatcher = new BlockVineaHatcher(BlockIds.VINEA_HATCHER);
       //vineSapStill = new BlockVineSapStill(BlockIds.VINE_SAP_STILL);
       //vineSapFlowing = new BlockVineSapFlowing(BlockIds.VINE_SAP_FLOWING);
       advancedMachineBlock = new BlockAdvancedMachineBlock(BlockIds.ADVANCED_MACHINE_BLOCK);
       basicMachineBlock = new BlockBasicMachineBlock(BlockIds.BASIC_MACHINE_BLOCK);
       vineaBrick = new BlockVineaBrick(BlockIds.VINEA_BRICK);
       vineaHopper = new BlockVineaHopper(BlockIds.VINEA_HOPPER);
       vineaFluidHopper = new BlockVineaFluidHopper(BlockIds.VINEA_FLUID_HOPPER);
       //blockVineSap = new BlockVineSap(BlockIds.BLOCK_VINE_SAP, vineSap, Material.water);
       
       
       //vineSap = new Fluid("Vine_Sap");
        
       GameRegistry.registerBlock(vineaInfuser, Strings.VINEA_INFUSER_NAME);
       GameRegistry.registerBlock(manualSqueezer, Strings.MANUAL_SQUEEZER_NAME);
       GameRegistry.registerBlock(automaticSqueezer, Strings.AUTOMATIC_SQUEEZER_NAME);
       GameRegistry.registerBlock(advancedSqueezer, Strings.ADVANCED_SQUEEZER_NAME);
       GameRegistry.registerBlock(vineaFurnace, Strings.VINEA_FURNACE_NAME);
       GameRegistry.registerBlock(vineaHarvester, Strings.VINEA_HARVESTER_NAME);
       //GameRegistry.registerBlock(vineSapFlowing, Strings.VINE_SAP_FLOWING_NAME);
       //GameRegistry.registerBlock(vineSapStill, Strings.VINE_SAP_STILL_NAME);
       GameRegistry.registerBlock(advancedMachineBlock, Strings.ADVANCED_MACHINE_BLOCK_NAME);
       GameRegistry.registerBlock(basicMachineBlock, Strings.BASIC_MACHINE_BLOCK_NAME);
       GameRegistry.registerBlock(vineaHatcher, Strings.VINEA_HATCHER_NAME);
       GameRegistry.registerBlock(vineaBrick, Strings.VINEA_BRICK_NAME);
       GameRegistry.registerBlock(vineaHopper, Strings.VINEA_HOPPER_NAME);
       GameRegistry.registerBlock(vineaFluidHopper, Strings.VINEA_FLUID_HOPPER_NAME);
       //GameRegistry.registerBlock(blockVineSap, Strings.BLOCK_VINE_SAP_NAME);
       
	   
       //FluidStuff
       
       //fluidVineSap = new Fluid ("Vine Sap");
       //FluidRegistry.registerFluid(vineSap);
       
       //vineSap = new BlockVineSap(3000, vineSap, Material.water).getFluid();
       
       vineSap = new FluidVineSap();
       
       
       //CraftingRecipes 
       
       GameRegistry.addRecipe(new ItemStack(manualSqueezer), new Object[] { "wpw", "rcr", "wbw", Character.valueOf('p'), Block.pistonBase, Character.valueOf('c'), Item.cauldron, Character.valueOf('w'), Block.cloth, Character.valueOf('r'), Item.redstone, Character.valueOf('b'), ModBlocks.basicMachineBlock });
       GameRegistry.addRecipe(new ItemStack(advancedMachineBlock), new Object[] { "sds", "rmr", "sis", Character.valueOf('m'), Block.cobblestoneMossy, Character.valueOf('i'), Block.blockIron, Character.valueOf('r'), Block.blockRedstone, Character.valueOf('s'), Item.stick, Character.valueOf('d'), Item.diamond });
       GameRegistry.addRecipe(new ItemStack(advancedMachineBlock), new Object[] { " f ", " t ", " b ", Character.valueOf('f'), Block.furnaceIdle, Character.valueOf('t'), ModItems.vineaTankModule, Character.valueOf('b'), advancedMachineBlock });
    }
    
 




	public static final String TEXTURE_LOCATION = "vineacraft";
    
    public static final String ADVANCED_MACHINE_BLOCK_TOP = "advancedMachineBlockTop";
    public static final String ADVANCED_MACHINE_BLOCK_SIDE = "advancedMachineBlockSide";
    public static final String ADVANCED_MACHINE_BLOCK_BOTTOM = "advancedMachineBlockBottom";
    
    public static final String BASIC_MACHINE_BLOCK_TOP_AND_BOT = "basicMachineBlockTopAndBot";
    public static final String BASIC_MACHINE_BLOCK_SIDE = "basicMachineBlockSide";
    
    public static final String VINEA_FURNACE_FRONT = "vineaFurnaceFront";
    
    public static final String MANUAL_SQUEEZER_SIDE = "manualSqueezerSide";
    public static final String MANUAL_SQUEEZER_TOP = "manualSqueezerTop";
    public static final String MANUAL_SQUEEZER_BOT = "manualSqueezerBot";
    
    //public static final String ADVANCED_SQUEEZER_TOP_ACTIVE = "advancedSqueezerTopActive";
    public static final String ADVANCED_SQUEEZER_TOP = "advancedSqueezerTop";
    public static final String ADVANCED_SQUEEZER_SIDE = "advancedSqueezerSide";
    public static final String ADVANCED_SQUEEZER_BOT = "advancedSqueezerBot";
    
    public static final String AUTOMATIC_SQUEEZER_TOP = "automaticSqueezerTop";
    public static final String AUTOMATIC_SQUEEZER_SIDE = "automaticSqueezerSide";
    public static final String AUTOMATIC_SQUEEZER_BOT = "automaticSqueezerBot";
    
    public static final String VINEA_HATCHER_SIDE = "vineaHatcherSide";
    public static final String VINEA_HATCHER_BOT = "vineaHatcherBot";
    
    public static final String VINEA_BRICK_ALL_SIDES = "vineaBrickAllSides";
    
    public static final String VINE_SAP_STILL_ICON = "vineSapStillIcon";
    public static final String VINE_SAP_FLOWING_ICON = "vineSapFlowingIcon";
    
    public static void registerTileEntities(){
        
        GameRegistry.registerTileEntity(TileManualSqueezer.class, Strings.TE_MANUAL_SQUEEZER_NAME);
        GameRegistry.registerTileEntity(TileAutomaticSqueezer.class, Strings.TE_AUTOMATIC_SQUEEZER_NAME);
        GameRegistry.registerTileEntity(TileAdvancedSqueezer.class, Strings.TE_ADVANCED_SQUEEZER_NAME);
        GameRegistry.registerTileEntity(TileVineaHatcher.class, Strings.TE_VINEA_HATCHER_NAME);
        GameRegistry.registerTileEntity(TileVineaFurnace.class, Strings.TE_VINEA_FURNACE_NAME);
        GameRegistry.registerTileEntity(TileVineaInfuser.class, Strings.TE_VINEA_INFUSER_NAME);
        GameRegistry.registerTileEntity(TileVineaHarvester.class, Strings.TE_VINEA_HARVESTER_NAME);
        GameRegistry.registerTileEntity(TileVineaHopper.class, Strings.TE_VINEA_HOPPER_NAME);
        
        
    }
}
